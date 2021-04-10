package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class JannikCommand extends Command {


    public JannikCommand(){
        super.name = "jannik";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("<:Noway:760987303329005601>");
    }
}
