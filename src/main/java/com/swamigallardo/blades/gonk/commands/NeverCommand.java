package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class NeverCommand extends Command {


    public NeverCommand(){
        super.name = "never";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/never-harrypotter-angry-fire-no-gif-4751988");
    }
}
