package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi3Command extends Command {


    public Obi3Command(){
        super.name = "obi3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/star-wars-ewan-mc-gregor-obi-wan-kenobi-beard-gif-5306564");
    }
}
