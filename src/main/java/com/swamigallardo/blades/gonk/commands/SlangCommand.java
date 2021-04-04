package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SlangCommand extends Command {


    public SlangCommand(){
        super.name = "slang";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://media1.tenor.com/images/b2e349f67d16c16aacdbc8dcb64e5a9d/tenor.gif?itemid=7205343");
    }
}
