package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Never2Command extends Command {


    public Never2Command(){
        super.name = "never2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/alfred-never-batman-smile-loyalty-gif-5163408");
    }
}
