package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class KJCCommand extends Command {


    public KJCCommand(){
        super.name = "KJC";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/im-stuck-stuck-trapped-superstore-send-help-gif-15692145");
    }
}
