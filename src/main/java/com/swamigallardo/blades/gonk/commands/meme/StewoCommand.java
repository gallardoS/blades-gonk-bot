package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class StewoCommand extends Command {


    public StewoCommand(){
        super.name = "Stewo";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://www.youtube.com/watch?v=sxbQ0BN_in8");
    }
}
