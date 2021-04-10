package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BCLCommand extends Command {


    public BCLCommand(){
        super.name = "BCL";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://media.discordapp.net/attachments/549838049744519168/800153852107685908/hellothere.gif");
    }
}
