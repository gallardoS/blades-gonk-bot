package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PatCommand extends Command {


    public PatCommand(){
        super.name = "pat";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/pat-good-boy-gif-7220650");
    }
}
