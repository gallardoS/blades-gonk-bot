package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class AvaranCommand extends Command {


    public AvaranCommand(){
        super.name = "avaran";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://s3.gifyu.com/images/nonono.gif");
    }
}
