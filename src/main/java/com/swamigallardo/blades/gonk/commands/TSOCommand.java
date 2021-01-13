package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class TSOCommand extends Command {


    public TSOCommand(){
        super.name = "TSO";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/lottery-loser-rat-mouse-gif-12761681");
    }
}
