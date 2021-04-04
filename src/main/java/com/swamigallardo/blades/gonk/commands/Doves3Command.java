package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Doves3Command extends Command {


    public Doves3Command(){
        super.name = "doves3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/peepo-peepoleave-gif-20075315");
    }
}
