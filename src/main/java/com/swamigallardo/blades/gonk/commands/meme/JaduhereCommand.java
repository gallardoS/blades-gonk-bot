package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class JaduhereCommand extends Command {


    public JaduhereCommand(){
        super.name = "Jaduhere";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/snoop-dogg-dr-dre-calvin-cordozar-broadus-jr-american-rapper-car-gif-17654008");
    }
}
