package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class IceCommand extends Command {


    public IceCommand(){
        super.name = "ice";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/the-iceman-cometh-batman-forever-arnold-schwarzenegger-gif-10776182");
    }
}
