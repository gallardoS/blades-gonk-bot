package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class RelaCommand extends Command {


    public RelaCommand(){
        super.name = "Rela";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/moin-moin-moin-norden-nordlicht-niedlich-gif-12086614");
    }
}
