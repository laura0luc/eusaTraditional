package com.eusa.service;

import java.util.Date;

import com.eusa.dao.ServicioDao;

public class CronNotificationService {
	
	private ServicioDao servicioDao;
	
	public ServicioDao getServicioDao() {
		return servicioDao;
	}

	public void setServicioDao(ServicioDao servicioDao) {
		this.servicioDao = servicioDao;
	}

	/* (non-Javadoc)
	 * @see com.eusa.service.NotificationService#saluda()
	 */
	public void saluda() {
		
		System.out.println(servicioDao.findAll());
		String result = "Hola a las " + new Date();
		System.out.println(result);
		
	}

}
