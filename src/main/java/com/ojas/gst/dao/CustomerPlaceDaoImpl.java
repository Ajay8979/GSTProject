package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerPlace;

public class CustomerPlaceDaoImpl extends JpaDao<CustomerPlace, Long> implements CustomerPlaceDao{

	public CustomerPlaceDaoImpl() {
		super(CustomerPlace.class);
		// TODO Auto-generated constructor stub
	}
private EntityManager entityManager;

	


	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
