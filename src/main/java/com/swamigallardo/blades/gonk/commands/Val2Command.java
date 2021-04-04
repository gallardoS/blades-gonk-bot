package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val2Command extends Command {


    public Val2Command(){
        super.name = "Val2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/cat-spin-record-cute-gif-16753412");
    }
}
