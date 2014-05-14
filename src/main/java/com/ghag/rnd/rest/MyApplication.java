package com.ghag.rnd.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("com.ghag.rnd.rest");
    }
}


