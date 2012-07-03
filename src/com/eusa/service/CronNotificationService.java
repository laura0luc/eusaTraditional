package com.eusa.service;

import java.util.Date;

import com.eusa.dao.ServicioDao;

public class CronNotificationService {
	
	private ServicioDao servicioDao;
	private AbstractNotificationService abstractNotificationService;
	


	/* (non-Javadoc)
	 * @see com.eusa.service.NotificationService#saluda()
	 */
	public void saluda() {
		
		//System.out.println(servicioDao.findAll());
		
		abstractNotificationService.calculaProxNotificacion(servicioDao.findAll());
		String result = "Cron running a las " + new Date();
		System.out.println(result);
		
	}
	
	
	public ServicioDao getServicioDao() {
		return servicioDao;
	}

	public void setServicioDao(ServicioDao servicioDao) {
		this.servicioDao = servicioDao;
	}

	public AbstractNotificationService getAbstractNotificationService() {
		return abstractNotificationService;
	}

	public void setAbstractNotificationService(
			AbstractNotificationService abstractNotificationService) {
		this.abstractNotificationService = abstractNotificationService;
	}

}
