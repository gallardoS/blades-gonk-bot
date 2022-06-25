package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Mutane3Command extends Command {


    public Mutane3Command(){
        super.name = "mutane3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/nintendo-luigis-mansion-king-boo-boo-ghost-gif-20527063");
    }
}
