package com.kitchen.tracker.controller;

import com.kitchen.tracker.models.Grocery;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
@Component
public class RestController {

    @GET
    @Produces("application/json")
    public Grocery health() {
        return new Grocery("Test", 0);
    }

}
