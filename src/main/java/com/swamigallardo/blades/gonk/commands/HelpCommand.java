package com.swamigallardo.blades.gonk.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;


public class HelpCommand extends Command {
    List<Command> commandList;

    public HelpCommand(List<Command> commands){
        super.name = "commands";
        super.help = "Displays the command list";
        this.commandList = commands;
    }

    @Override
    protected void execute(CommandEvent event) {
            event.getChannel().sendMessage(buildEmbedMessage(commandList).build()).queue();
    }

    public EmbedBuilder buildEmbedMessage(List<Command> commandList){
        EmbedBuilder embedMessage = new EmbedBuilder();
        String bfhIcon = "https://i.imgur.com/05yRTv7.png";


        List<String> commandListString = commandList.stream().
                map(command -> listIt(command.getName()))
                .collect(Collectors.toList());

        embedMessage.setDescription("" + commandListString);

        embedMessage.setTitle("*List of Commands:*");
        embedMessage.setColor(new Color(229,170,68));
        embedMessage.setFooter("This bot is developed by BLAD3. Contact me via Discord Human#0106");
        return embedMessage;
    }

    private String listIt(String command){
        String prefix = "!";
        return prefix + command;
    }

}
