package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Michael3Command extends Command {


    public Michael3Command(){
        super.name = "michael3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/shut-up-quiet-hush-silence-gif-19474264");
    }
}
