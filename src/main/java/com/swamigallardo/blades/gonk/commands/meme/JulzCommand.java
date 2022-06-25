package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class JulzCommand extends Command {


    public JulzCommand(){
        super.name = "Julz";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/pandaflowers-gif-20694641");
    }
}
