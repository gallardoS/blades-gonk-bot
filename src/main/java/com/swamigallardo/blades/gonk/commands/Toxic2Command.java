package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Toxic2Command extends Command {


    public Toxic2Command(){
        super.name = "toxic2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/kendra-on-top-really-toxic-bad-negative-poison-gif-9246894");
    }
}
