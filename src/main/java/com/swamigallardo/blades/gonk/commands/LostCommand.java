package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LostCommand extends Command {


    public LostCommand(){
        super.name = "Lost";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/lost-gif-9819628");
    }
}
