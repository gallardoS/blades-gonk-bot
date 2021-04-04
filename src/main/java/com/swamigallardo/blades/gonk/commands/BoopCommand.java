package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BoopCommand extends Command {


    public BoopCommand(){
        super.name = "Boop";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/boop-bird-animation-cute-mlg-gif-7296714");
    }
}
