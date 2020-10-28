package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.List;

@Slf4j
public class DecideCommand extends Command {
    List<String> emojiList = Arrays.asList(":white_check_mark:",":x: ",":x:");

    String bfhIcon = "https://i.imgur.com/05yRTv7.png";

    public DecideCommand(){
        super.name = "scrimformat";
    }

    @Override
    protected void execute(CommandEvent event) {
        List<String> formatsList = Arrays.asList("Specials Off ", "Specials On ", "Class restricted ");
        Collections.shuffle(emojiList);
        event.getChannel().sendMessage(buildEmbedMessage(formatsList).build()).queue();


        log.info("Command !" + super.name
                + " called by " + event.getAuthor().getName()
                + " on " + event.getChannel().getName()
                + " at " + new SimpleDateFormat("HH:mm:ss dd-MM-yyyy").format(Date.from(Instant.now()))
                + ". List order: " + emojiList.toString());
    }

    public EmbedBuilder buildEmbedMessage(List<String> formatsList){

        EmbedBuilder embedMessage = new EmbedBuilder();
        embedMessage.setTitle("Scrim Format - Random Generated");
        embedMessage.setColor(new Color(229,170,68));
        embedMessage.setFooter("The Battlefront Hub", bfhIcon);
        for (int i = 0; i < formatsList.size(); i++) {
           if(getEmoji(i) == ":white_check_mark:"){
              formatsList.set(i, boldIt(formatsList.get(i)));
           };
        }
        embedMessage.setDescription("> " + formatsList.get(0) + getEmoji(0) + System.getProperty("line.separator") +
                "> " + formatsList.get(1) + getEmoji(1) + System.getProperty("line.separator") +
                "> " + formatsList.get(2) + getEmoji(2));
        return embedMessage;
    }

    public String getEmoji(int index){
        return emojiList.get(index);
    }

    public String boldIt(String text){
        return "**" + text + "** ";
    }
}
