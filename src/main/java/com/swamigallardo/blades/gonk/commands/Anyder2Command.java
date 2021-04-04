package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Anyder2Command extends Command {


    public Anyder2Command(){
        super.name = "Anyder2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/madara-uchiha-gif-12579330");
    }
}
