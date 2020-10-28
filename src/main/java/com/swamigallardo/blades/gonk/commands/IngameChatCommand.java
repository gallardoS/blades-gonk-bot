package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class IngameChatCommand extends Command {
    public IngameChatCommand(){
        super.name = "chat";
    }

    @Override
    protected void execute(CommandEvent event) {
        Boolean conditionsMet = checkConditions(event.getArgs(), event);
        while(conditionsMet){
            //
        }

    }

    public Boolean checkConditions(String message, CommandEvent event){
        Boolean result = false;


        if(message.equalsIgnoreCase("on")){
            result = true;
        }

        return result;

    }
}
