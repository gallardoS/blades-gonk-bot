package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class HakanCommand extends Command {


    public HakanCommand(){
        super.name = "Hakan";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/mmmmuaaaah-mashallah-gif-5243762");
    }
}
