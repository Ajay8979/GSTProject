package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerTaxPayer;

public class CustomerTaxPayerDaoImpl extends JpaDao<CustomerTaxPayer, Long>  implements CustomerTaxPayerDao{

	public CustomerTaxPayerDaoImpl() {
		super(CustomerTaxPayer.class);
	}
	
	
	private EntityManager entityManager;

	

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	

	@Override
	public CustomerTaxPayer find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



}
