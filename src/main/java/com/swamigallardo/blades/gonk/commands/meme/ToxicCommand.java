package com.swamigallardo.blades.gonk.commands.meme;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;


public class ToxicCommand extends Command {


    public ToxicCommand(){
        super.name = "toxic";
    }

    @Override
    protected void execute(CommandEvent event) {
        event.reply("https://tenor.com/view/youre-toxic-toxic-person-not-healthy-difficult-person-annoyed-gif-15854893");
    }
}
