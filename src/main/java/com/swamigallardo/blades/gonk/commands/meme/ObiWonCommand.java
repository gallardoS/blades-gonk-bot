package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ObiWonCommand extends Command {


    public ObiWonCommand(){
        super.name = "obiwon";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://streamable.com/goqxx2");
    }
}