package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Boop2Command extends Command {


    public Boop2Command(){
        super.name = "Boop2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/milk-mocha-nose-milk-and-mocha-nose-milk-and-mocha-boop-milk-mocha-boop-milk-and-mocha-nose-boop-gif-19678376");
    }
}
