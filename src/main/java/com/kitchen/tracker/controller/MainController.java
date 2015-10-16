package com.kitchen.tracker.controller;

import com.kitchen.tracker.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/main")
@Component
public class MainController {

    @Autowired
    private MainService mainServiceImpl;

    @GET
    @Produces("text/html")
    @Transactional
    public String index() {
        mainServiceImpl.createGrocery("Test", 12);
        return "Success";
    }
}
