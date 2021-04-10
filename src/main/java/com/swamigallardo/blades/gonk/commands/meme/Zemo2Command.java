package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Zemo2Command extends Command {


    public Zemo2Command(){
        super.name = "Zemo2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/791261730931343361/805555648157974568/tenor.gif");
    }
}
