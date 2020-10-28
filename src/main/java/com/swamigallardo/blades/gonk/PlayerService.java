package com.swamigallardo.blades.gonk;

import org.apache.commons.lang3.StringEscapeUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {

    /**
     * POST Request to obtain the list of players currently online
     * Requires access to SWBF2 Admin of the server
     *
     *
     * @return JSONArray list of current players
     * @throws IOException
     */
     public JSONArray getCurrentPlayers(String urlString, String authHeaderValue) throws IOException {
        URL url = new URL(urlString);

        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization" , authHeaderValue);

        String jsonInputString = "{\"Action\" : \"players_update\"}";

        try(OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;

            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return new JSONArray(response.toString());
        }
    }

    /**
     * Get a String list of names of online players
     *
     *
     * @param currentPlayers JSONArray of current players
     * @return List<String> with names of current players
     */
    public List<String> getNamesList(JSONArray currentPlayers){
        List<String> playerList = new ArrayList<>();
        currentPlayers.forEach(p -> {
            JSONObject player = (JSONObject) p;
            playerList.add(player.getString("Name"));
        });
        return playerList;
    }

    /**
     * Transform characters like "&gt;" to ">"
     *
     *
     * @param playerList list of player names
     * @return unescaped html string
     */
    public String unescapeHtml(String playerList){
        return StringEscapeUtils.unescapeHtml4(playerList);
    }
}

