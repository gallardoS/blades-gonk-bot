package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val5Command extends Command {


    public Val5Command(){
        super.name = "Val5";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/spinning-seal-water-funny-gif-5129604");
    }
}
