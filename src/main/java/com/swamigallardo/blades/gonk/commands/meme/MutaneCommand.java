package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class MutaneCommand extends Command {


    public MutaneCommand(){
        super.name = "mutane";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/teddy-bear-flower-for-you-im-sorry-sorry-gif-14333561");
    }
}
