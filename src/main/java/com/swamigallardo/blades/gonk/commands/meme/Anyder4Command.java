package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Anyder4Command extends Command {


    public Anyder4Command(){
        super.name = "Anyder4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/weakness-disgusts-me-senju-gif-13079766");
    }
}
