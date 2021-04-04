package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Jack2Command extends Command {


    public Jack2Command(){
        super.name = "Jack2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/FrailSwissMageYouDontSay");
    }
}
