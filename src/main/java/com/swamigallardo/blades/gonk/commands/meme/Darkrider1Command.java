package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Darkrider1Command extends Command {


    public Darkrider1Command(){
        super.name = "darkrider1";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/try-harder-try-trying-do-better-gif-8287072");
    }
}
