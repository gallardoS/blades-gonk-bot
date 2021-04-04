package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Doves4Command extends Command {


    public Doves4Command(){
        super.name = "doves4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/shut-up-man-will-you-gif-18636332");
    }
}
