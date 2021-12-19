package Main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


import java.util.Random;

public class Commands extends ListenerAdapter
{
    public String prefix = "!";

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        String[] args = event.getMessage().getContentRaw().split(" ");
        if (event.getAuthor().isBot()) return; //makes sure MishaBot doesn't respond to itself or other bots
        MessageChannel channel = event.getChannel();
        if (args[0].equalsIgnoreCase(prefix + "joke")){
            channel.sendMessage("I invented a new word! Plagiarism!").queue();
        }
        else if (args[0].equalsIgnoreCase(prefix + "goodsong")){
            channel.sendMessage("https://www.youtube.com/watch?v=lIuEuJvKos4").queue();
        }
        else if (args[0].equalsIgnoreCase(prefix + "compliment")){
            channel.sendMessage(event.getMember().getAsMention() + ", you are hot!").queue();
        }
        else if (args[0].equalsIgnoreCase(prefix + "info")){
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("MishaBot");
            info.setDescription("I am a bot and this is my info card.");
            info.addField("Commands:", "!joke !goodsong !compliment", false);
            info.setFooter("MishaBot was created by Misha", "https://lh3.googleusercontent.com/a-/AOh14GhUjUSpRfXyp6jlUsXgDgOe4RFzzpCCUT5Ywfgegg=s288-p-rw-no");
            event.getChannel().sendMessageEmbeds(info.build()).queue();
            info.clear();
        }
    }
}