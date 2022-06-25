package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Hakan2Command extends Command {


    public Hakan2Command(){
        super.name = "Hakan2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/mar-ggebauer-wow-mashallah-gif-15304534");
    }
}
