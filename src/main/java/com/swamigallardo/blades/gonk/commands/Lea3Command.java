package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Lea3Command extends Command {


    public Lea3Command(){
        super.name = "lea3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/anime-pout-hmph-mad-ugh-gif-12679335");
    }
}
