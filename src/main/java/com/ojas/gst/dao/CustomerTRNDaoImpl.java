package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerTRN;

public class CustomerTRNDaoImpl extends JpaDao<CustomerTRN, Long>  implements CustomerTRNDao{

	
	
	public CustomerTRNDaoImpl() {
		super(CustomerTRN.class);
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