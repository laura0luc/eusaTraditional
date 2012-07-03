package com.eusa.service;

import java.util.List;

import com.eusa.domain.*;

public  class AbstractNotificationService {
	TemporalNotificationService temporalNotificationService;
	UnidadNotificationService unidadNotificationService;
	
    public void calculaProxNotificacion(List<Servicio> serv){
		
		System.out.println("====" + serv.size());
		System.out.println("en abtrackt ");
		for (Servicio s: serv){
			if(s instanceof  ServicioTemporal){
				temporalNotificationService.calculaServicio(s);
				System.out.println("en abtrackt 2 ");
			}else{
				//unidadNotificationService.validaDia(s);
			}
		 }
	}

	public TemporalNotificationService getTemporalNotificationService() {
		return temporalNotificationService;
	}

	public void setTemporalNotificationService(
			TemporalNotificationService temporalNotificationService) {
		this.temporalNotificationService = temporalNotificationService;
	}

	public UnidadNotificationService getUnidadNotificationService() {
		return unidadNotificationService;
	}

	public void setUnidadNotificationService(
			UnidadNotificationService unidadNotificationService) {
		this.unidadNotificationService = unidadNotificationService;
	}
    
    
    
}
