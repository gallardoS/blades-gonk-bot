package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class DSPCommand extends Command {


    public DSPCommand(){
        super.name = "DSP";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/this-server-sucks-this-server-sucks-server-sucks-gif-20441118");
    }
}
