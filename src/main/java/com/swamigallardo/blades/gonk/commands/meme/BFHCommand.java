package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BFHCommand extends Command {


    public BFHCommand(){
        super.name = "BFH";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/lotr-squad-gif-5398456");
    }
}
