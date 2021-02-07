package org.sash;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class HelloResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Sashvin";
    }

    @GET
     @Path("/home")
    @Produces(MediaType.TEXT_PLAIN)
    public String sash() {
        return "Hello from v3";
    }
}