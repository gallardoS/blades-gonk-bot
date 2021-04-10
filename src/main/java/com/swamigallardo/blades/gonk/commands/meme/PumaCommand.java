package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PumaCommand extends Command {


    public PumaCommand(){
        super.name = "puma";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("<:Puma:762729025839693835>");
    }
}
