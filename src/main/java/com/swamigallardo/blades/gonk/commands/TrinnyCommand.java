package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class TrinnyCommand extends Command {


    public TrinnyCommand(){
        super.name = "trinny";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/cat-rave-disco-head-bang-cute-gif-17210240");
    }
}
