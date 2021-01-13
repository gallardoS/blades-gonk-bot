package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class CaamenCommand extends Command {


    public CaamenCommand(){
        super.name = "caamen";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/dance-kid-club-gif-9152583");
    }
}
