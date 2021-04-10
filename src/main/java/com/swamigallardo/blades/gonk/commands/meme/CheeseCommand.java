package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class CheeseCommand extends Command {


    public CheeseCommand(){
        super.name = "cheese";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/aaron-rodgers-nfl-gif-4763728");
    }
}
