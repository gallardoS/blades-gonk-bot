package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val1Command extends Command {


    public Val1Command(){
        super.name = "Val1";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/emojis/869947817962139670.gif?v=1");
    }
}
