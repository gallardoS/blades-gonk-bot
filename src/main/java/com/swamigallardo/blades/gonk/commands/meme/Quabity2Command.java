package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Quabity2Command extends Command {

    String[] aliases = new String[]{"quab2","quaby2"};

    public Quabity2Command(){
        super.name = "quabity2";
        super.aliases = aliases;
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/the-waterboy-the-office-creed-quabity-funny-gif-20017095");
    }
}
