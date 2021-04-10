package com.swamigallardo.blades.gonk;

import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import com.swamigallardo.blades.gonk.commands.*;
import com.swamigallardo.blades.gonk.commands.meme.*;
import com.swamigallardo.blades.gonk.discordtoken.DiscordToken;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Bot {
    private Bot() throws LoginException {
        String token = new DiscordToken().getDiscordToken();

        JDABuilder bui = JDABuilder.createDefault(token);
        final JDA jda = bui.setToken(token).build();
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
    client.addCommand(new AnyderCommand());
    client.addCommand(new Anyder2Command());
    client.addCommand(new Anyder3Command());
    client.addCommand(new BladeCommand());
    client.addCommand(new Blade2Command());
    client.addCommand(new Blade3Command());
    client.addCommand(new BonkCommand());
    client.addCommand(new BoopCommand());
    client.addCommand(new Boop2Command());
    client.addCommand(new BCLCommand());
    client.addCommand(new BFHCommand());
    client.addCommand(new BFH2Command());
    client.addCommand(new BrandonCommand());
    client.addCommand(new CaamenCommand());
    client.addCommand(new Caamen2Command());
    client.addCommand(new Caamen3Command());
    client.addCommand(new ChameauCommand());
    client.addCommand(new Chameau2Command());
    client.addCommand(new CheeseCommand());
    client.addCommand(new CocoCommand());
    client.addCommand(new CrudeCommand());
    client.addCommand(new DovesCommand());
    client.addCommand(new Doves2Command());
    client.addCommand(new Doves3Command());
    client.addCommand(new Doves4Command());
    client.addCommand(new GroguCommand());
    client.addCommand(new IceCommand());
    client.addCommand(new InflexibleCommand());
    client.addCommand(new JackCommand());
    client.addCommand(new Jack2Command());
    client.addCommand(new Jack3Command());
    client.addCommand(new Jack4Command());
    client.addCommand(new JannikCommand());
    client.addCommand(new KekJCCommand());
    client.addCommand(new KektaneCommand());
    client.addCommand(new KevinCommand());
    client.addCommand(new KJCCommand());
    client.addCommand(new LeaCommand());
    client.addCommand(new Lea2Command());
    client.addCommand(new Lea3Command());
    client.addCommand(new LegitosityCommand());
    client.addCommand(new LennyCommand());
    client.addCommand(new Lenny2Command());
    client.addCommand(new Lenny3Command());
    client.addCommand(new Lenny4Command());
    client.addCommand(new LostCommand());
    client.addCommand(new LoserCommand());
    client.addCommand(new LukasCommand());
    client.addCommand(new MikoCommand());
    client.addCommand(new MichaelCommand());
    client.addCommand(new Michael2Command());
    client.addCommand(new MutaneCommand());
    client.addCommand(new Mutane2Command());
    client.addCommand(new NeverCommand());
    client.addCommand(new Never2Command());
    client.addCommand(new NiceCommand());
    client.addCommand(new NiniCommand());
    client.addCommand(new NowayCommand());
    client.addCommand(new ObiCommand());
    client.addCommand(new Obi1Command());
    client.addCommand(new Obi2Command());
    client.addCommand(new Obi3Command());
    client.addCommand(new Obi4Command());
    client.addCommand(new Obi5Command());
    client.addCommand(new ObiWonCommand());
    client.addCommand(new PainCommand());
    client.addCommand(new PatCommand());
    client.addCommand(new PokeCommand()); 
    client.addCommand(new PogCommand());
    client.addCommand(new PumaCommand());
    client.addCommand(new QuabityCommand());
    client.addCommand(new RelaCommand());
    client.addCommand(new ReverseCommand());
    client.addCommand(new RogerRogerCommand());
    client.addCommand(new SeanCommand());
    client.addCommand(new Sean2Command());
    client.addCommand(new Sean3Command());
    client.addCommand(new SnachCommand());
    client.addCommand(new SlangCommand());
    client.addCommand(new SlenderCommand());
    client.addCommand(new SuperChameauCommand());
    client.addCommand(new SupermadCommand());
    client.addCommand(new TrinaldoCommand());
    client.addCommand(new ToxicCommand());
    client.addCommand(new Toxic2Command());
    client.addCommand(new TrinnyCommand());
    client.addCommand(new TSOCommand());
    client.addCommand(new ValCommand());
    client.addCommand(new Val2Command());
    client.addCommand(new Val3Command());
    client.addCommand(new Val4Command());
    client.addCommand(new Val5Command());
    client.addCommand(new YodaCommand());
    client.addCommand(new Yoda2Command());
    client.addCommand(new ZemoCommand());
    client.addCommand(new Zemo2Command());
    client.addCommand(new Zemo3Command());

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
