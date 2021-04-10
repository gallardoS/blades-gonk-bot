package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class NowayCommand extends Command {


    public NowayCommand(){
        super.name = "noway";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/no-panda-anime-shy-embarrassed-gif-5141988");
    }
}
