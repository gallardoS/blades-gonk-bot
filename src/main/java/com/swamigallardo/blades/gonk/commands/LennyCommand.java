package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LennyCommand extends Command {


    public LennyCommand(){
        super.name = "lenny";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/ato-gif-18533409");
    }
}
