package com.dxctechnology.resoureces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
public class WelcomeREST {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String displayMediaType() {
		return "<html><body><h1>Message from WelcomeRest class displayMediaType()</h1></body></html>";
	}
	
	@GET
	@Path("all")
	public String display() {
		return "Message from WelcomeRest class display()";
	}
}
