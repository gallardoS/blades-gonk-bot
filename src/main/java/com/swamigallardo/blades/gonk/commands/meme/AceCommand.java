package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class AceCommand extends Command {


    public AceCommand(){
        super.name = "ace";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/troll-dungeon-harrypotter-gif-5157432");
    }
}
