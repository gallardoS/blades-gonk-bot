package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class JackCommand extends Command {


    public JackCommand(){
        super.name = "Jack";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://clips.twitch.tv/BelovedAnimatedParrotPhilosoraptor");
    }
}
