package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Twitter;
import model.TwitterEntity;
import service.twitterEJB;
import twitter4j.TwitterException;

@ManagedBean(name = "twittercontroller")
@SessionScoped
public class TwitterController {
	
	@EJB
	twitterEJB twitterservice;
	
	@ManagedProperty(value = "#{twitter}")
	private Twitter twitter;
	
	private TwitterDrivers tweetdriver = new TwitterDrivers();
	
	private List<TwitterEntity> twitterList = new ArrayList<>();
	
	
	public Twitter getTwitter() {
		return twitter;
	}
	
	public List<TwitterEntity> getTwitterList() {
		twitterList = twitterservice.getAllTweets();
		return twitterList;
	}
	
	public void setTwitter(Twitter twitter) {
		this.twitter = twitter;
	}
	
	public void setTwitter(List<TwitterEntity> twitterList) {
		
		this.twitterList = twitterList;
	}

	public void addNewTwitter() {
		System.out.println("it worked");
		twitterservice.addNewTwitter(twitter.getEntity());
		
	}
	
	public String viewTweets() {
		return "tweetsList.xhtml";
	}
	
	public void tweet() {
		try {
			TwitterDrivers.createTweet(twitter.getTweetBody());
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

}
