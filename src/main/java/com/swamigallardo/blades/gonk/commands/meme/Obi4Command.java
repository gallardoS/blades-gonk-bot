package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi4Command extends Command {


    public Obi4Command(){
        super.name = "obi4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/star-wars-obi-wan-kenobi-whats-going-on-here-whats-going-on-the-clone-wars-gif-17129962");
    }
}
