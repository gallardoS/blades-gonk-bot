package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BladeCommand extends Command {


    public BladeCommand(){
        super.name = "blade";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/hackintothemainframe-hack-into-the-mainframe-gif-12192418");
    }
}
