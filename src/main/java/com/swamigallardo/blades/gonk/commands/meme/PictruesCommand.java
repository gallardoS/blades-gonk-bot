package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PictruesCommand extends Command {


    public PictruesCommand(){
        super.name = "Pictrues";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/mlbshitpost-bot-gif-18674403");
    }
}
