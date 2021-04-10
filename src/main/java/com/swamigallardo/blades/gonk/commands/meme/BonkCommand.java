package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BonkCommand extends Command {


    public BonkCommand(){
        super.name = "bonk";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/psyduck-farfetchd-pokemon-gif-17872492");
    }
}
