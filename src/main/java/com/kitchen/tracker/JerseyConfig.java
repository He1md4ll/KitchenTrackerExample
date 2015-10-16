package com.kitchen.tracker;

import com.kitchen.tracker.controller.MainController;
import com.kitchen.tracker.controller.RestController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RestController.class);
        register(MainController.class);
    }
}
