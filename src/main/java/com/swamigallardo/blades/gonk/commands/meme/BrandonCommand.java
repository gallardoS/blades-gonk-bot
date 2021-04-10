package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BrandonCommand extends Command {


    public BrandonCommand(){
        super.name = "brandon";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/the-goon-brandon-pat-morita-mr-miyagi-miagi-gif-12332309");
    }
}
