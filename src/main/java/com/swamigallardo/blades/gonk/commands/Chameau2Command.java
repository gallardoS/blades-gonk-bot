package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Chameau2Command extends Command {


    public Chameau2Command(){
        super.name = "chameau2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/orson-welles-welles-orson-pas-mal-cest-fran%C3%A7ais-gif-13761350");
    }
}
