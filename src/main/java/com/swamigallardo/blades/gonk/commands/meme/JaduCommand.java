package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class JaduCommand extends Command {


    public JaduCommand(){
        super.name = "Jadu";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/snoop-dogg-ijust-stopped-smoking-yesterday-stopped-gif-16827580");
    }
}
