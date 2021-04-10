package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Sean3Command extends Command {


    public Sean3Command(){
        super.name = "sean3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/scrubs-nobody-cares-sean-gif-12085110");
    }
}
