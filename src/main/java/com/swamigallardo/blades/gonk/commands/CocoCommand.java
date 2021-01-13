package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class CocoCommand extends Command {


    public CocoCommand(){
        super.name = "coco";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/provoking-mad-angry-baron-french-baron-french-sniper-gif-17752734");
    }
}
