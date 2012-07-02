package com.eusa.service;

import java.util.Date;

public class CronNotificationService {
	
	
	/* (non-Javadoc)
	 * @see com.eusa.service.NotificationService#saluda()
	 */
	public void saluda() {
		String result = "Hola a las " + new Date();
		System.out.println(result);
		
	}

}
