package com.example.servlet.jersey_quickstart_webapp;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("webapi")
public class WebapiConfig extends ResourceConfig {
	public WebapiConfig() {
		packages(this.getClass().getPackage().getName());
//		packages("com.github.kamegu.first");
	}
}
