package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class TrinaldoCommand extends Command {


    public TrinaldoCommand(){
        super.name = "trinaldo";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://cdn.discordapp.com/attachments/731269742870003764/792812464386867240/image0.gif");
    }
}
