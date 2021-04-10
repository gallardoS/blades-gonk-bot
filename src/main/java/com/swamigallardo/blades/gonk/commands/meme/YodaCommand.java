package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class YodaCommand extends Command {


    public YodaCommand(){
        super.name = "yoda";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/starwars-yoda-falling-weird-gif-5318150");
    }
}
