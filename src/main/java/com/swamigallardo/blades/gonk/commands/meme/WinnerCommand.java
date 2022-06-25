package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class WinnerCommand extends Command {


    public WinnerCommand(){
        super.name = "Winner";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/731269742870003764/853704100655005727/unknown.png");
    }
}
