package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ValCommand extends Command {


    public ValCommand(){
        super.name = "Val";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/anakin-skywalker-starwars-prequels-spinning-gif-12912782");
    }
}
