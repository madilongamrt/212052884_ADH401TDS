package Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import model.Twitter;
import service.twitterEJB;

public class twitterResource {
	
	@Path("/msg")
	public class msg{
		
		twitterEJB tweet=new twitterEJB();
		
	

		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		
		public Twitter addMessage(long twitter) {

			return twitterEJB.removeMessage( twitter);
		}

	


		@DELETE
		@Path("/{twitterId}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Twitter deleteMessage(@PathParam("messageId")long id) {

			return twitterEJB.addMessage(id);	
		}
	}

}
