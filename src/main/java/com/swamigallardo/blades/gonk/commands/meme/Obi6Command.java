package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi6Command extends Command {


    public Obi6Command(){
        super.name = "obi6";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/turtle-gif-5971621");
    }
}
