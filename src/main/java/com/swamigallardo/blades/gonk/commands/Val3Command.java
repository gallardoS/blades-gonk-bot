package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val3Command extends Command {


    public Val3Command(){
        super.name = "Val3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/bunny-spin-gif-11404554");
    }
}
