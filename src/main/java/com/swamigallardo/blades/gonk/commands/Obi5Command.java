package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi5Command extends Command {


    public Obi5Command(){
        super.name = "obi5";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://i.imgur.com/rtD7t6q.mp4");
    }
}
