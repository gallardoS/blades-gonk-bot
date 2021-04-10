package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Lenny3Command extends Command {


    public Lenny3Command(){
        super.name = "lenny3";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/master-oogway-kung-fu-panda-inner-peace-gif-11501603");
    }
}
