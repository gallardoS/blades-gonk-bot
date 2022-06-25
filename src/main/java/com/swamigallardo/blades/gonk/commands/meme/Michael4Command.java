package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Michael4Command extends Command {


    public Michael4Command(){
        super.name = "michael4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/731269640424128615/871112439406657536/giphy.mp4");
    }
}
