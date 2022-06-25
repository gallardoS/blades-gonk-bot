package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Kektane2Command extends Command {


    public Kektane2Command(){
        super.name = "kektane2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/HealthyFitMageRaccAttack-iz9GmNn9xfjemeyx");
    }
}
