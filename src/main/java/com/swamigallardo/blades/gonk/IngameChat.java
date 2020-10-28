package com.swamigallardo.blades.gonk;

import lombok.NonNull;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.PrivateChannel;
import net.dv8tion.jda.api.entities.TextChannel;
import org.jetbrains.annotations.NonNls;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class IngameChat {

    public IngameChat(JDA jda) {
        System.out.println("hi");
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                jda.getTextChannelById("754744198304890911")
                        .sendMessage("TESTING. Sending message every few seconds. This is supposed to be a message of the ingame chat.");

            }
        };

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 5);
    }
}

