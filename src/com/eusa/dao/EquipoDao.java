package com.eusa.dao;


import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import com.eusa.domain.Equipo;



@SuppressWarnings("unchecked")
public class EquipoDao extends AbstractDao<Equipo, Long > {
	
	@Transactional(readOnly=true)
	public void findAllByServiceId() {
		
		
		this.getHibernateTemplate().
	      findByNamedParam("from Equipo eq inner join fetch eq.mate" + 
	              "", "ids", ""); 
		
		
	//	where ci.id in (:ids) 
		
	}

}
