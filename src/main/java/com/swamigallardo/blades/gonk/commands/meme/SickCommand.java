package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SickCommand extends Command {


    public SickCommand(){
        super.name = "Sick";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/merkel-angela-skype-videocall-look-gif-17003034");
    }
}
