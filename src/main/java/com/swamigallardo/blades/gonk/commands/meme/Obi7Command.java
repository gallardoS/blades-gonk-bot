package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi7Command extends Command {


    public Obi7Command(){
        super.name = "obi7";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/star-wars-the-clone-wars-civilized-theres-no-reason-we-cant-be-civilized-obi-wan-kenobi-gif-15918134");
    }
}
