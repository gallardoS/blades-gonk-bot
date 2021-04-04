package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class AnyderCommand extends Command {


    public AnyderCommand(){
        super.name = "Anyder";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/madara-laugh-gif-18383332");
    }
}
