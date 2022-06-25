package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class TobiCommand extends Command {


    public TobiCommand(){
        super.name = "Tobi";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/adorable-aww-baby-panda-po-gif-4255978");
    }
}
