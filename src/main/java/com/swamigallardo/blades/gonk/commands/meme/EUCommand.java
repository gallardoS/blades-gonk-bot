package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class EUCommand extends Command {


    public EUCommand(){
        super.name = "EU";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/conquest-gif-21211522");
    }
}
