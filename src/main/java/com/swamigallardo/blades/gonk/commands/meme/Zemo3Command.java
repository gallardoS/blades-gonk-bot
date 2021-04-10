package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Zemo3Command extends Command {


    public Zemo3Command(){
        super.name = "Zemo3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://www.twitch.tv/zemooo/clip/WealthyResilientVelociraptorBudStar");
    }
}
