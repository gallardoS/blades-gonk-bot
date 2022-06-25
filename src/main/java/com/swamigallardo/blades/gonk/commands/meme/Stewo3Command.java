package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Stewo3Command extends Command {


    public Stewo3Command(){
        super.name = "Stewo3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/739093044346748948/842010010467696690/Unbekannt.gif");
    }
}
