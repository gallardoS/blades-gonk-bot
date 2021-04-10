package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ChameauCommand extends Command {


    public ChameauCommand(){
        super.name = "chameau";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/humpday-wednesday-camel-gif-3566504");
    }
}
