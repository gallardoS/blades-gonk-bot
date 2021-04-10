package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class KektaneCommand extends Command {


    public KektaneCommand(){
        super.name = "kektane";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/AdventurousAntsyPandaPoooound");
    }
}
