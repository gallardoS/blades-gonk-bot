package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.swamigallardo.blades.gonk.DashboardService;
import com.swamigallardo.blades.gonk.MapTranslator;
import com.swamigallardo.blades.gonk.PlayerService;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.EmbedBuilder;
import org.json.JSONObject;

import java.awt.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Slf4j
public class CurrentCommandScrim1 extends Command {

    PlayerService playerService = new PlayerService();
    DashboardService dashboardService = new DashboardService();
    MapTranslator mapTranslator = new MapTranslator();

    String urlPlayers = "http://192.248.161.198:20395/live/players";
    String urlDashboard = "http://192.248.161.198:20395/live/dashboard";

    String bfhIcon = "https://i.imgur.com/05yRTv7.png";

    String authHeaderValue = "Basic QmxhZDM6RnVqaTIwMjAq";

    String[] aliases = new String[]{"Scrim1","onlinescrim1"};

    public CurrentCommandScrim1(){
        super.name = "onlineScrim1";
        super.aliases = aliases;
        super.help = "Displays the current players online for EU Scrim 1";
    }

    @Override
    protected void execute(CommandEvent event) {

        try {
            int currentPlayers = playerService.getCurrentPlayers(urlPlayers, authHeaderValue).length();
            JSONObject jsonDashboard = dashboardService.getDashboard(urlDashboard,authHeaderValue);
            log.info("Command !" + super.name
                    + " called by " + event.getAuthor().getName()
                    + " on " + event.getChannel().getName()
                    + " at " + new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").format(Date.from(Instant.now()))
                    + ". Length is " + currentPlayers + "/20. ");
            event.getChannel().sendMessage(buildEmbedMessage(currentPlayers, jsonDashboard).build()).queue();
        } catch (Exception e) {
            event.getChannel().sendMessage(getEmbedMessageError().build()).queue();
            log.error("Command !" + super.name
                    + " called at " + new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").format(Date.from(Instant.now()))
                    + " failed. " + e.getMessage());
        }
    }

    public EmbedBuilder buildEmbedMessage(int currentPlayers, JSONObject jsonDashboard) throws IOException {
        EmbedBuilder embedMessage = new EmbedBuilder();


        List<String> playerList = playerService.getNamesList(playerService.getCurrentPlayers(urlPlayers, authHeaderValue));
        playerList.sort(String.CASE_INSENSITIVE_ORDER);
        String playerListTrim = String.join(", ", playerList);

        embedMessage.setTitle("BFH London 1 - Current players: " + currentPlayers + "/" + jsonDashboard.getString("MaxPlayers"));
        embedMessage.setColor(new Color(229,170,68));
        embedMessage.setFooter("Battlefront Hub", bfhIcon);
        if (!playerListTrim.isEmpty()){
        embedMessage.setDescription("> " + playerService.unescapeHtml(playerListTrim));
        }
        try{
            embedMessage.addField("**Current map**",
                    mapTranslator.getMapsList().get(jsonDashboard.getString("CurrentMap")), true);

        }catch (Exception e){
            embedMessage.addField("**Current map**", jsonDashboard.getString("CurrentMap"), true);

        }
        try{
            embedMessage.addField("**Next map**",
                mapTranslator.getMapsList().get(jsonDashboard.getString("NextMap")), true);
        }catch(Exception e){
            embedMessage.addField("**Next map**",jsonDashboard.getString("NextMap"), true);
        }
        return embedMessage;
    }

    public EmbedBuilder getEmbedMessageError(){
        EmbedBuilder embedMessageError = new EmbedBuilder();

        embedMessageError.setTitle("BFH Scrim 1 - Error");
        embedMessageError.setDescription("> There was an error. Contact an <@&731263165480042498>.");
        embedMessageError.setColor(Color.RED);
        embedMessageError.setFooter("Battlefront Hub", bfhIcon);
        return embedMessageError;
    }

}
