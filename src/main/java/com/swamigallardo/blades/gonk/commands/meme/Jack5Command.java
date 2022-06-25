package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Jack5Command extends Command {


    public Jack5Command(){
        super.name = "Jack5";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/kermit-suicide-flip-jump-crash-gif-5140737");
    }
}
