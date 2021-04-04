package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Blade3Command extends Command {


    public Blade3Command(){
        super.name = "blade3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/shut-the-fuck-up-dave-chappelle-shut-up-stfu-gif-5518509");
    }
}
