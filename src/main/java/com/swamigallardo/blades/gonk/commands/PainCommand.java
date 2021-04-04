package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PainCommand extends Command {


    public PainCommand(){
        super.name = "Pain";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/rip-juice-cry-cat-kitten-tears-gif-15751834");
    }
}
