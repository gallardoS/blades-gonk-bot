package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Jack3Command extends Command {


    public Jack3Command(){
        super.name = "Jack3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/angry-fist-arthur-%E6%86%A4%E6%80%92-gif-5794225");
    }
}
