package de.dks.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/myrestService")
@ApplicationPath("/resources")
public class RestService extends Application{
	
	//http://localhost:8080/frontend/resources/myrestService/sayHello
	
	@GET
	@Path("/sayHello")
	public String getHelloMsg() {
		return "Hello";
	}
	
	
	@GET
	@Path("/echo")
	public Response getechMsg(@QueryParam("message") String msg) {
		
		return Response.ok("your message was:" + msg).build();
		
	}

}
