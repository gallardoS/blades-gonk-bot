package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class DaveCommand extends Command {


    public DaveCommand(){
        super.name = "dave";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://youtu.be/lUtyvxsU8Ts");
    }
}
