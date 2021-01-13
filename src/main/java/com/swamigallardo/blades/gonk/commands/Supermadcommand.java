package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SupermadCommand extends Command {


    public SupermadCommand(){
        super.name = "supermad";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/super-mad-so-mad-annoyed-walk-out-gif-16363247");
    }
}
