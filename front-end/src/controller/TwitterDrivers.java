package controller;

import model.Twitter;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterDrivers {

	public static String createTweet(String tweetBody) throws TwitterException {
		Twitter twitter = getTwitterInstance();
	    Status status = twitter.updateStatus(tweetBody);
	    return status.getText();
		
	}

	private static Twitter getTwitterInstance() {
		ConfigurationBuilder configbuild = new ConfigurationBuilder();
		configbuild.setDebugEnabled(true)
		  .setOAuthConsumerKey("5gdu8oXw0CSFwRQMizGGpFpBq")
		  .setOAuthConsumerSecret("tatDwyn9skctsiObRSAFHb60bi6fjZjVtI6pZbV8g1NiHVgKQU")
		  .setOAuthAccessToken("1180546367737008128-jJ6ThQzVJPgA6UnLm9CSVWZ4lUqK63")
		  .setOAuthAccessTokenSecret("izIYGDE1Cm4Iht0Qlq18HkPclrpHonKQ6NKKZVcVetJAR");
		TwitterFactory twfact = new TwitterFactory(configbuild.build());
		return (Twitter) twfact.getInstance();
	}

}
