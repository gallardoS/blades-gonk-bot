package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Lea2Command extends Command {


    public Lea2Command(){
        super.name = "lea2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/kitty-kitten-annoyed-irritated-tantrum-gif-13045775");
    }
}
