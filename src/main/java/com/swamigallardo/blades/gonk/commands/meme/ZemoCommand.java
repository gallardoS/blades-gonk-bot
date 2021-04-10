package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ZemoCommand extends Command {


    public ZemoCommand(){
        super.name = "Zemo";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://cdn.discordapp.com/attachments/791261730931343361/805555510329081916/giphy.gif");
    }
}
