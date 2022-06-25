package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Chameau3Command extends Command {


    public Chameau3Command(){
        super.name = "chameau3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/FamousEvilFrogOptimizePrime-0IXYwpHdY2rpKctF");
    }
}
