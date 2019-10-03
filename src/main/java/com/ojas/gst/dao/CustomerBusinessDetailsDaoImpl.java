package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerBusinessDetails;

public class CustomerBusinessDetailsDaoImpl extends JpaDao<CustomerBusinessDetails, Long>  implements CustomerBusinessDetailsDao{

	public CustomerBusinessDetailsDaoImpl() {
		super(CustomerBusinessDetails.class);
		
	}
	
	
	public CustomerBusinessDetailsDaoImpl(Class<CustomerBusinessDetails> entityClass, EntityManager entityManager) {
		super(entityClass);
		this.entityManager = entityManager;
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
