package Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

public class tweetMesg {
	
	 private final static String CONSUMER_KEY = "5gdu8oXw0CSFwRQMizGGpFpBq";
	 private final static String CONSUMER_KEY_SECRET = "tatDwyn9skctsiObRSAFHb60bi6fjZjVtI6pZbV8g1NiHVgKQU";
	
	 
 public void start() throws TwitterException, IOException {
    	 
    	 Twitter twitter = new TwitterFactory().getInstance();
    	 
    	 twitter.setOAuthConsumer(CONSUMER_KEY, CONSUMER_KEY_SECRET);
    	 
    	 RequestToken requestToken = twitter.getOAuthRequestToken();
    	 
    	 System.out.println("Authorization URL: \n" + requestToken.getAuthorizationURL());
    	 
    	 AccessToken accessToken = null;
    	 
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 while (null == accessToken) {
    	     try {
    	  System.out.print("Input PIN here: ");
    	  String pin = br.readLine();
    	 
    	  accessToken = twitter.getOAuthAccessToken(requestToken, pin);
    	 
    	     } catch (TwitterException te) {
    	 
    	  System.out.println("Failed to get access token, caused by: " + te.getMessage());
    	 
    	  System.out.println("Retry input PIN");
    	 
    	     }
    	 }
    	 
    	 System.out.println("Access Token: " + accessToken.getToken());
    	 System.out.println("Access Token Secret: " + accessToken.getTokenSecret());
    	 
    	 twitter.updateStatus("hi.. im updating this using Namex Tweet for Demo");
    	 
   }
 
 

}
