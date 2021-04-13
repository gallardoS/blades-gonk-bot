package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Blade4Command extends Command {


    public Blade4Command(){
        super.name = "blade4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/IcyPrettyFlyKappaClaus-DFgqKPzi03ZP3z2a");
    }
}
