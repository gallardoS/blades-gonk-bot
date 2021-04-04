package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Val4Command extends Command {


    public Val4Command(){
        super.name = "Val4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/758729734241648712/804148068109910056/GrievousSpin.gif");
    }
}
