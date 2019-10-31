package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="twitter_tbl")
public class TwitterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long TweetID;
	private String tweetBody;
	private Date date;
	
	
	public Long getTweetID() {
		return TweetID;
	}
	
	public void setTweetID(Long tweetID) {
		TweetID = tweetID;
	}
	
	public String getTweetBody() {
		return tweetBody;
	}
	
	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	

}
