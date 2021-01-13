package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class RogerRogerCommand extends Command {


    public RogerRogerCommand(){
        super.name = "RogerRoger";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/roger-roger-gif-15393242");
    }
}
