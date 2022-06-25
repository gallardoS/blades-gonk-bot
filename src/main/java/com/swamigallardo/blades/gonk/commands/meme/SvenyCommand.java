package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class SvenyCommand extends Command {


    public SvenyCommand(){
        super.name = "Sveny";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/hand-of-blood-ehre-mordhau-gif-14853132");
    }
}
