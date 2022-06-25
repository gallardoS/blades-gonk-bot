package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SuperChameau2Command extends Command {


    public SuperChameau2Command(){
        super.name = "SuperChameau2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/issou-risitas-moulaland-gif-20794110");
    }
}
