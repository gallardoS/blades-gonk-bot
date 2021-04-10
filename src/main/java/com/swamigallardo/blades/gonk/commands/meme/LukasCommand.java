package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LukasCommand extends Command {


    public LukasCommand(){
        super.name = "lukas";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://ibb.co/mD9g0K9");
    }
}
