package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class CrudeCommand extends Command {


    public CrudeCommand(){
        super.name = "Crude";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://tenor.com/view/trevor-philips-trevorphilips-wazzup-gif-5699576");
    }
}
