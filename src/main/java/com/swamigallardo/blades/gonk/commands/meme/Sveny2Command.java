package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Sveny2Command extends Command {


    public Sveny2Command(){
        super.name = "Sveny2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/star-wars-clone-wars-clone-wars-season7-ahsoka-ahsoka-tano-gif-16168399");
    }
}
