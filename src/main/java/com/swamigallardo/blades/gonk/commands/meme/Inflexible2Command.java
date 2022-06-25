package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Inflexible2Command extends Command {


    public Inflexible2Command(){
        super.name = "Inflexible2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://c.tenor.com/FNgsex-z5B8AAAAM/star-wars-wut.gif");
    }
}
