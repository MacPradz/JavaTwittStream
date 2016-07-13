import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by MacPradz on 2016-07-13.
 */
public class Main {
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cf = new ConfigurationBuilder();
        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");

        TwitterFactory tf = new TwitterFactory(cf.build());
        Twitter twitter = tf.getInstance();
        List<Status> status = twitter.getHomeTimeline();
        for (Status st : status){
            System.out.println("----"+st.getUser().getName()+" ----"+st.getText());
        }
    }
}
