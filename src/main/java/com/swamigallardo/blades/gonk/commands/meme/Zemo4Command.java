package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Zemo4Command extends Command {


    public Zemo4Command(){
        super.name = "Zemo4";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://i.gyazo.com/f9f37d15137b6aa6f55f9ba86ab2eb91.mp4");
    }
}
