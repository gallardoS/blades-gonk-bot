package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class RIPCommand extends Command {


    public RIPCommand(){
        super.name = "RIP";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://streamable.com/6uicvd");
    }
}
