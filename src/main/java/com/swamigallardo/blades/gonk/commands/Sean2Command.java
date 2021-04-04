package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Sean2Command extends Command {


    public Sean2Command(){
        super.name = "sean2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/sean-is-cute-sean-cute-gif-13886003");
    }
}
