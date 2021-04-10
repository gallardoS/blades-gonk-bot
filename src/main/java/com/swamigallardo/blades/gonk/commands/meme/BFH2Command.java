package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class BFH2Command extends Command {


    public BFH2Command(){
        super.name = "BFH2";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/dancing-monkeys-chimpanzee-jig-tap-dance-gif-16196660");
    }
}
