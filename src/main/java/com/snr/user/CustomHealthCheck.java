/**
 * 
 */
package com.snr.user;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author I326319
 *
 */
@Component
public class CustomHealthCheck implements HealthIndicator{
	int errorCode = 0;
	
	@Override
	public Health health() {
		
		System.out.println("Health check is performed : error code is: "+errorCode);
		
		if(errorCode > 2 && errorCode <8) {
			errorCode++;
			return Health.down().withDetail("Custome error code", errorCode).build();
		}
		
		errorCode ++;
	
		return Health.up().build();
	}

}
