package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class WowCommand extends Command {


    public WowCommand(){
        super.name = "Wow";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/wow-phenomenal-amazing-great-gif-5981661");
    }
}
