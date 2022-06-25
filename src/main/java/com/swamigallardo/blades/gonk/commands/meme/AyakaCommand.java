package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class AyakaCommand extends Command {


    public AyakaCommand(){
        super.name = "Ayaka";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://imgur.com/ouQLSbu");
    }
}
