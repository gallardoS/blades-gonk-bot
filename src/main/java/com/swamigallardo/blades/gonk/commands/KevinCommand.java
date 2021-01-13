package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class KevinCommand extends Command {


    public KevinCommand(){
        super.name = "kevin";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/pokemon-charmander-fire-flame-turning-gif-15494875");
    }
}
