package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class NiceCommand extends Command {


    public NiceCommand(){
        super.name = "Nice";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://tenor.com/view/jamie-lannister-nikolaj-coster-waldau-nice-happy-impressed-gif-5536508");
    }
}
