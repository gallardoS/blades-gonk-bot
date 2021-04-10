package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SeanCommand extends Command {


    public SeanCommand(){
        super.name = "sean";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("<:Sean:760931938826453074>");
    }
}
