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
        JDABuilder bui = JDABuilder.createDefault("NzI2MTA2MDE4MjQwNjU5NDU2.XvYc7Q.iD8MYxTs-vCwJjxyF6O_ZjpGxG4");
        final JDA jda = bui.setToken("NzI2MTA2MDE4MjQwNjU5NDU2.XvYc7Q.iD8MYxTs-vCwJjxyF6O_ZjpGxG4").build();
    CommandClientBuilder builder = new CommandClientBuilder();
    builder.setPrefix("!");
    builder.setHelpWord("helpPM");
    builder.setOwnerId("726106018240659456");
    builder.setActivity(Activity.playing("!commands"));
    CommandClient client = builder.build();

    client.addCommand(new HelpCommand(client.getCommands()));
    client.addCommand(new PingCommand());

    client.addCommand(new CurrentCommand());
    client.addCommand(new CurrentCommand2());
    client.addCommand(new CurrentCommandFun());
    client.addCommand(new CurrentCommandHeroes());
    client.addCommand(new CurrentCommandScrim1());
    client.addCommand(new CurrentCommandScrim2());
    client.addCommand(new CurrentCommandScrim3());

    client.addCommand(new DecideCommand());
    client.addCommand(new DecideCommandSmall());

    client.addCommand(new AceCommand());
    client.addCommand(new BladeCommand());
    client.addCommand(new BrandonCommand());
    client.addCommand(new CaamenCommand());
    client.addCommand(new Caamen2Command());
    client.addCommand(new ChameauCommand());
    client.addCommand(new Chameau2Command());
    client.addCommand(new CheeseCommand());
    client.addCommand(new CocoCommand());
    client.addCommand(new CrudeCommand());
    client.addCommand(new DovesCommand());
    client.addCommand(new GroguCommand());
    client.addCommand(new IceCommand());
    client.addCommand(new JackCommand());
    client.addCommand(new JannikCommand());
    client.addCommand(new KevinCommand());
    client.addCommand(new LeaCommand());
    client.addCommand(new Lea2Command());
    client.addCommand(new Lea3Command());
    client.addCommand(new LostCommand());
    client.addCommand(new LoserCommand());
    client.addCommand(new MikoCommand());
    client.addCommand(new MichaelCommand());
    client.addCommand(new MutaneCommand());
    client.addCommand(new NeverCommand());
    client.addCommand(new NowayCommand());
    client.addCommand(new ObiCommand());
    client.addCommand(new Obi2Command());
    client.addCommand(new Obi3Command());
    client.addCommand(new ObiWonCommand());
    client.addCommand(new PogCommand());
    client.addCommand(new PumaCommand());
    client.addCommand(new QuabityCommand());
    client.addCommand(new ReverseCommand());
    client.addCommand(new RogerRogerCommand());
    client.addCommand(new SeanCommand());
    client.addCommand(new SnachCommand());
    client.addCommand(new SlenderCommand());
    client.addCommand(new SuperChameauCommand());
    client.addCommand(new SupermadCommand());
    client.addCommand(new TrinaldoCommand());
    client.addCommand(new ToxicCommand());
    client.addCommand(new Toxic2Command());
    client.addCommand(new TrinnyCommand());
    client.addCommand(new TSOCommand());
    client.addCommand(new ValCommand());
    client.addCommand(new YodaCommand());

    client.addCommand(new IngameChatCommand());

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
