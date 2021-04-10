package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Caamen2Command extends Command {


    public Caamen2Command(){
        super.name = "caamen2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/DifferentFurtiveKuduPeteZarollTie");
    }
}
