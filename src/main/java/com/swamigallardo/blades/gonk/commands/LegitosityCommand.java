package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class LegitosityCommand extends Command {


    public LegitosityCommand(){
        super.name = "legitosity";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/cat-cats-funny-light-sabers-light-saber-gif-5483839");
    }
}
