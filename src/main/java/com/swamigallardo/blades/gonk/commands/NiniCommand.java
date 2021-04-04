package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class NiniCommand extends Command {


    public NiniCommand(){
        super.name = "Nini";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://tenor.com/view/bear-blow-a-kiss-love-hearts-kissing-gif-15229339");
    }
}
