package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Crude2Command extends Command {


    public Crude2Command(){
        super.name = "Crude2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://streamable.com/0pnbu2");
    }
}
