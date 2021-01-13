package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class QuabityCommand extends Command {

    String[] aliases = new String[]{"quab","quaby"};

    public QuabityCommand(){
        super.name = "quabity";
        super.aliases = aliases;
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/the-office-no-michael-scott-gif-10951187");
    }
}
