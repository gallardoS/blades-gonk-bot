package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Yoda2Command extends Command {


    public Yoda2Command(){
        super.name = "yoda2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/chile-yoda-creepy-weird-luke-skywalker-gif-8844889");
    }
}
