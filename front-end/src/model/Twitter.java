package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "twitter")
@SessionScoped
public class Twitter {
	
	private String tweetBody;

	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	
	public TwitterEntity getEntity() {
		
		TwitterEntity twitterentity = new TwitterEntity();
		twitterentity.setTweetBody(tweetBody);
		
		
		return twitterentity;
	}
	
	

}
