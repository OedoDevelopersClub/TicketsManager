package net.oekora.tickets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

    
/**
 *
 * @author mowarte
 */
@Path("rest")
public class Hello {

    @GET
    @Produces("text/plain")
    public String get() {
        return "Hello world";
    }
}

