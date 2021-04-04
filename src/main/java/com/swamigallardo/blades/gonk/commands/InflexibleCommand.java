package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class InflexibleCommand extends Command {


    public InflexibleCommand(){
        super.name = "Inflexible";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://ibb.co/cYgYrhF");
    }
}
