package com.Deva.actuator.health;

import java.net.URL;
import java.net.URLConnection;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMetrics  implements HealthIndicator{
	@Override
	public Health health() {
	//	Health heath= null;
		return checkInternat() == true?Health.up().withDetail("success code ", "Actatva Internet connection").build()
				                  :Health.down().withDetail("success code ", "InActatva Internet connection").build();	
		//return null;
	}
	private boolean checkInternat() {
		boolean flag=false;
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
		}catch(Exception e){
			flag = false;		
		}
		return  flag;	
	}
}
