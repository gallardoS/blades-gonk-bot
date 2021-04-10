package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class PogCommand extends Command {


    public PogCommand(){
        super.name = "Pog";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/pogchamp-pog-pogey-poggers-twitch-gif-14340727");
    }
}
