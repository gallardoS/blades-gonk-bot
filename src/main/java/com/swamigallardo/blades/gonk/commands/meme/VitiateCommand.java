package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class VitiateCommand extends Command {


    public VitiateCommand(){
        super.name = "Vitiate";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/kurwa-mac-zoom-face-glasses-gif-17435136");
    }
}
