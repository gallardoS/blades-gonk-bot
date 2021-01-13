package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi2Command extends Command {


    public Obi2Command(){
        super.name = "obi2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/713867248913219675/793902676303413259/Obi-Wan_hello_there.gif");
    }
}
