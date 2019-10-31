package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import model.TwitterEntity;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

/**
 * Session Bean implementation class twitterEJB
 */
@Stateless
@LocalBean
public class twitterEJB {
	
	
	@PersistenceContext
	private EntityManager tw;
	
    public twitterEJB() {
       
    }
    
    
    public void addNewTwitter(TwitterEntity twitterEntity) {
    	System.out.println("=======adding  new twitter===to database");
    	
    	tw.persist(twitterEntity);
    }
    
    public List<TwitterEntity> getAllTweets(){
    	
    	
    	return new ArrayList<TwitterEntity> (tw.createQuery("select * from twitter_tbl ",TwitterEntity.class).getResultList());
    }




}
