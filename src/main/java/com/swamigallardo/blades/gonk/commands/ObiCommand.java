package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ObiCommand extends Command {


    public ObiCommand(){
        super.name = "obi";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/droideka-gif-18612108");
    }
}
