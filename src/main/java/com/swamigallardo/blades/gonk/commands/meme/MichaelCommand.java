package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class MichaelCommand extends Command {


    public MichaelCommand(){
        super.name = "michael";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/laughing-big-mouth-eat-screaming-crazy-gif-12904194");
    }
}
