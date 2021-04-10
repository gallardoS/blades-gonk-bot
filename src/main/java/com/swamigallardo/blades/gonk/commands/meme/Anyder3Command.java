package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Anyder3Command extends Command {


    public Anyder3Command(){
        super.name = "Anyder3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/naruto-what-madara-anime-uchiha-gif-17446196");
    }
}
