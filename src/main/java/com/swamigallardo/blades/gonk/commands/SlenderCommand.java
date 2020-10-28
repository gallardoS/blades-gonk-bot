package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SlenderCommand extends Command {


    public SlenderCommand(){
        super.name = "slender";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/this-is-fine-gif-5263684");
    }
}
