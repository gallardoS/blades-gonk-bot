package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Blade2Command extends Command {


    public Blade2Command(){
        super.name = "blade2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/ResoluteProtectiveWatercressTBTacoLeft-gssCax64QNRbxsaQ");
    }
}
