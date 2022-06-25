package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Slender2Command extends Command {


    public Slender2Command(){
        super.name = "slender2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/slendy-slenderman-happy-yay-excited-gif-5793636");
    }
}
