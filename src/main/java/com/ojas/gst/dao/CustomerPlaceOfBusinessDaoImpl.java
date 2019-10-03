package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerPlaceOfBusiness;

public class CustomerPlaceOfBusinessDaoImpl extends JpaDao<CustomerPlaceOfBusiness, Long>  implements CustomerPlaceOfBusinessDao{

	

	public CustomerPlaceOfBusinessDaoImpl() {
		super(CustomerPlaceOfBusiness.class);
	}

	private EntityManager entityManager;

	

	public CustomerPlaceOfBusinessDaoImpl(Class<CustomerPlaceOfBusiness> entityClass) {
		super(entityClass);
	}

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
