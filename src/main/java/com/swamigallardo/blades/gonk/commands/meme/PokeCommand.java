package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PokeCommand extends Command {


    public PokeCommand(){
        super.name = "poke";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/lil-peep-poke-annoy-milk-and-mocha-hearts-gif-10271400");
    }
}
