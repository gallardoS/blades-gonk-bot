package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SnachCommand extends Command {


    public SnachCommand(){
        super.name = "Snach";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/hot-shots-hot-shots-part-deux-hot-shots-part-two-hot-shots2-gif-19404030");
    }
}
