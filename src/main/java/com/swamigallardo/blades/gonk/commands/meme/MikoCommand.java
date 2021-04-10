package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class MikoCommand extends Command {


    public MikoCommand(){
        super.name = "miko";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/saitama-one-punch-man-ok-okay-unimpressed-gif-4838585");
    }
}
