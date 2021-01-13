package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class DovesCommand extends Command {


    public DovesCommand(){
        super.name = "doves";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/the-goon-dodgeball-white-goodman-ben-stiller-hello-gif-14921205");
    }
}
