package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Caamen3Command extends Command {


    public Caamen3Command(){
        super.name = "caamen3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/SilkyShyEggShadyLulu-fym11qlyvHOKgzrj");
    }
}
