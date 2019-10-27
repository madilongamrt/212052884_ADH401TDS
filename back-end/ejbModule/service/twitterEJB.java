package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    	System.out.println("it add new twitter");
    	
    	tw.persist(twitterEntity);
    }







	public static model.Twitter addMessage(long twitter) {
		// TODO Auto-generated method stub
		return null;
	}







	public static model.Twitter removeMessage(long id) {
		// TODO Auto-generated method stub
		return null;
	}
    
  
    

}
