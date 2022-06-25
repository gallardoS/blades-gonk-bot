package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class StudmuffinCommand extends Command {


    public StudmuffinCommand(){
        super.name = "Studmuffin";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/screaming-mad-fish-sponge-bob-angry-gif-15430458");
    }
}
