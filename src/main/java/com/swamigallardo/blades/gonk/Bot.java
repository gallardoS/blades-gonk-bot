package com.swamigallardo.blades.gonk;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.swamigallardo.blades.gonk.commands.*;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.ReadyEvent;

import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Bot {
    private Bot() throws LoginException {
        JDABuilder bui = JDABuilder.createDefault("NzI2MTA2MDE4MjQwNjU5NDU2.Xvxdqw.35CXh5FACDnmPu-O8WDbaiDpD48");
        final JDA jda = bui.setToken("NzI2MTA2MDE4MjQwNjU5NDU2.Xvxdqw.35CXh5FACDnmPu-O8WDbaiDpD48").build();
    CommandClientBuilder builder = new CommandClientBuilder();
    builder.setPrefix("!");
    builder.setHelpWord("helpPM");
    builder.setOwnerId("726106018240659456");
    builder.setActivity(Activity.playing("!commands"));
    CommandClient client = builder.build();
    client.addCommand(new PingCommand());
    client.addCommand(new CurrentCommand());
    client.addCommand(new CurrentCommand2());
    client.addCommand(new CurrentCommandFun());
    client.addCommand(new DecideCommand());
    client.addCommand(new DecideCommandSmall());
    client.addCommand(new JannikCommand());
    client.addCommand(new SeanCommand());
    client.addCommand(new PumaCommand());
    client.addCommand(new ObiCommand());
    client.addCommand(new SlenderCommand());
    client.addCommand(new IngameChatCommand());


    client.addCommand(new HelpCommand(client.getCommands()));


    jda.addEventListener(client);
    }

    public static void main(String[] args) throws LoginException {
        long enable = System.currentTimeMillis();
        new Bot();
        log.info("Bot enabled in " +
                TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - enable) +
                "ms.");
    }
}
