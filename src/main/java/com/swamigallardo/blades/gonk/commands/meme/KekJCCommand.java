package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class KekJCCommand extends Command {


    public KekJCCommand(){
        super.name = "KekJC";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://www.youtube.com/watch?v=HjfgkgvcYM8");
    }
}
