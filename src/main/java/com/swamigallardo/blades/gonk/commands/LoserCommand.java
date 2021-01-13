package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LoserCommand extends Command {


    public LoserCommand(){
        super.name = "Loser";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/759881447535804437/793166765219643393/loser.png");
    }
}
