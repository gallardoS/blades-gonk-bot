package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Chameau4Command extends Command {


    public Chameau4Command(){
        super.name = "chameau4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/FurtiveWonderfulBaconSMOrc-jXhaGAzFW-oJWcod");
    }
}
