package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ElevenCommand extends Command {


    public ElevenCommand(){
        super.name = "Eleven";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/big-ol-doinks-smokin-smokindoinks-gif-9945580");
    }
}
