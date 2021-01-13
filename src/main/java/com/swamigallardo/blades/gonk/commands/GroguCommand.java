package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class GroguCommand extends Command {


    public GroguCommand(){
        super.name = "grogu";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://cdn.discordapp.com/attachments/731269742870003764/792815190370156634/image0.gif");
    }
}
