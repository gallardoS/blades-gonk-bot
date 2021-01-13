package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ReverseCommand extends Command {


    public ReverseCommand(){
        super.name = "reverse";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/uno-reverse-card-funny-uno-reverse-card-gif-17246642");
    }
}
