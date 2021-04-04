package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Michael2Command extends Command {


    public Michael2Command(){
        super.name = "michael2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/dwight-michael-the-office-gif-13906754");
    }
}
