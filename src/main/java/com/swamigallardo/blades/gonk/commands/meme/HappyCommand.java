package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class HappyCommand extends Command {


    public HappyCommand(){
        super.name = "Happy";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/hi-lucas-the-spider-spider-cute-gif-11121339");
    }
}
