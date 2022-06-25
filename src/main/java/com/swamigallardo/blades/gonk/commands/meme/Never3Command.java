package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Never3Command extends Command {


    public Never3Command(){
        super.name = "never3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://streamable.com/x1q02x");
    }
}
