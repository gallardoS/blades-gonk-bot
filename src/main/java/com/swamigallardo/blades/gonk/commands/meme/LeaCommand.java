package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LeaCommand extends Command {


    public LeaCommand(){
        super.name = "lea";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/florida-vs-georgia-lea-duck-gif-12777112");
    }
}
