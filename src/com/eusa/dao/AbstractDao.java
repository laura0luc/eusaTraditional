package com.eusa.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;



@SuppressWarnings("unchecked")
public class AbstractDao<T, PK extends Serializable>
		extends HibernateDaoSupport  {
	
	private Class<T> type = null;
	
	@Transactional
	public void create(T newInstance) {
		this.getHibernateTemplate().save(newInstance);
	}

	@Transactional
	public void delete(T persistentObject) {
		this.getHibernateTemplate().delete(persistentObject);
	}

	@Transactional(readOnly=true)
	public List findAll() {
		return this.getHibernateTemplate().loadAll(getType());
	}

	/**
	 * Obtiene por reflexion el tipo del DomainObject que usa este DAO
	 * 
	 * @return the type
	 */
	public Class<T> getType() {
		if (type == null) {
			Class clazz = getClass();

			while (!(clazz.getGenericSuperclass() instanceof ParameterizedType)) {
				clazz = clazz.getSuperclass();
			}

			type = (Class<T>) ((ParameterizedType) clazz.getGenericSuperclass())
					.getActualTypeArguments()[0];
		}

		return type;
	}

	@Transactional(readOnly=true)
	public T read(PK id) {
		return (T) this.getHibernateTemplate().get(getType(), id);
	}

	@Transactional
	public void update(T transientObject) {
		this.getHibernateTemplate().update(transientObject);
	}

}
