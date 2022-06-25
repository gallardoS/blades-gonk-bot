package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class Obi8Command extends Command {


    public Obi8Command(){
        super.name = "obi8";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://media.discordapp.net/attachments/739093044346748948/847951019894898728/Obi_come_at_me_bro.gif");
    }
}
