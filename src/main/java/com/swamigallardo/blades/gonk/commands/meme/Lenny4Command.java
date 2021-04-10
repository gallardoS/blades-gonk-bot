package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Lenny4Command extends Command {


    public Lenny4Command(){
        super.name = "lenny4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/meditation-chakra-gif-7734858");
    }
}
