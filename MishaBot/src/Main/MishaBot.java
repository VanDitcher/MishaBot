package Main;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class MishaBot {
    public static void main(String []args) throws LoginException{
        JDABuilder jda = JDABuilder.createDefault("OTIyMjIwMDgyNDgwOTUxNDE2.Yb-SYQ.E-H0vvk8UeFw80mPgR6TolxkDzo");
        jda.setActivity(Activity.watching("Jojo"));
        jda.setStatus(OnlineStatus.ONLINE);
        jda.addEventListeners(new Commands()); //so commands actually work
        jda.build(); //logs bot in

    }
}
