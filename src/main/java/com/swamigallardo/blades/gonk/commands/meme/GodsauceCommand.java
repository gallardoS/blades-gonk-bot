package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class GodsauceCommand extends Command {


    public GodsauceCommand(){
        super.name = "Godsauce";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply	("https://tenor.com/view/robot-ketchup-fuck-you-funny-gif-5209498");
    }
}
