package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Twitter;
import service.twitterEJB;

@ManagedBean(name = "twittercontroller")
@SessionScoped
public class TwitterController {
	
	@EJB
	twitterEJB twitterservice;
	
	@ManagedProperty(value = "#{twitter}")
	private Twitter twitter;
	
	
	
	public Twitter getTwitter() {
		return twitter;
	}



	public void setTwitter(Twitter twitter) {
		this.twitter = twitter;
	}



	public void addNewTwitter() {
		System.out.println("it worked");
		twitterservice.addNewTwitter(twitter.getEntity());
		
	}

}
