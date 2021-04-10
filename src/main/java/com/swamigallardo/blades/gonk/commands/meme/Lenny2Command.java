package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Lenny2Command extends Command {


    public Lenny2Command(){
        super.name = "lenny2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://media1.tenor.com/images/a707a021495310a197cb09718ba34d00/tenor.gif?itemid=14037165");
    }
}
