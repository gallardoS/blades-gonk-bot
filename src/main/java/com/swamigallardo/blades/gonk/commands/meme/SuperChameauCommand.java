package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SuperChameauCommand extends Command {


    public SuperChameauCommand(){
        super.name = "SuperChameau";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/kaamelott-revolte-all-together-gif-11503049");
    }
}
