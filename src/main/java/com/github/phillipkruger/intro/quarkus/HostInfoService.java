package com.github.phillipkruger.intro.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HostInfoService {

    private final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
    
    public String getHostName(){
        return this.hostname;
    }
    
}