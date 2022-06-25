package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val6Command extends Command {


    public Val6Command(){
        super.name = "Val6";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/genshin-lumine-val-valerie-hi-val-gif-22174828");
    }
}
