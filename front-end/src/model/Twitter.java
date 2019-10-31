package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import twitter4j.Status;

@ManagedBean(name = "twitter")
@SessionScoped
public class Twitter {
	
	private Long tweetid;
	private Date date = new Date(System.currentTimeMillis());;
	

	private String tweetBody;
	
	public Long getTweetid() {
		return tweetid;
	}

	public void setTweetid(Long tweetid) {
		this.tweetid = tweetid;
	}

	
	public String getTweetBody() {
		return tweetBody;
	}

	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	
	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		return formatter.format(date);
	}

	public void setDate(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		formatter.format(date);
		this.date = date;
	}
	
	public TwitterEntity getEntity() {
		
		TwitterEntity twitterentity = new TwitterEntity();
		twitterentity.setTweetBody(tweetBody);
		twitterentity.setDate(date);
		twitterentity.setTweetID(tweetid);
		
		return twitterentity;
	}

	public Status updateStatus(String tweetBody2) {
		
		return null;
	}
	
	

}
