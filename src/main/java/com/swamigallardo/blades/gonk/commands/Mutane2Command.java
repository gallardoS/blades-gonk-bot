package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Mutane2Command extends Command {


    public Mutane2Command(){
        super.name = "mutane2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/el-conquis-el-conquistador-del-fin-del-mundo-david-seco-mud-man-gif-13940694");
    }
}
