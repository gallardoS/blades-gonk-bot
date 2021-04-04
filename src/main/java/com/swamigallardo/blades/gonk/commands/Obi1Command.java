package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi1Command extends Command {


    public Obi1Command(){
        super.name = "obi1";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/obiwan-star-wars-driving-happy-gif-5925441");
    }
}
