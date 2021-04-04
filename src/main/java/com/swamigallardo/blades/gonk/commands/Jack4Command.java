package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Jack4Command extends Command {


    public Jack4Command(){
        super.name = "Jack4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/rage-%E6%86%A4%E6%80%92-angry-furious-mad-gif-4514235");
    }
}
