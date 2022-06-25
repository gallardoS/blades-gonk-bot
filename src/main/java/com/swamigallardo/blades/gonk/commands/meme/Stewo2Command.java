package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Stewo2Command extends Command {


    public Stewo2Command(){
        super.name = "stewo2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/pizza-dough-chef-pizza-hut-commercial-gif-17563081");
    }
}
