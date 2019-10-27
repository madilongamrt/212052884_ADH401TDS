package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.jmx.snmp.Timestamp;

@Entity(name = "twitter_tbl")
public class TwitterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long TweetID;
	
	private String TweetBody;
	
	private Timestamp ts = new Timestamp((new Date()).getTime( ));

	
	
	public Long getTweetID() {
		return TweetID;
	}

	public void setTweetID(Long tweetID) {
		TweetID = tweetID;
	}

	public String getTweetBody() {
		return TweetBody;
	}

	public void setTweetBody(String tweetBody) {
		TweetBody = tweetBody;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	
	

}
