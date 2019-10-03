package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerBankAccountDetails;

public class CustomerBankAccountDetailsDaoImpl extends JpaDao<CustomerBankAccountDetails, Long>  implements CustomerBankAccountDetailsDao{

	public CustomerBankAccountDetailsDaoImpl() {
		super(CustomerBankAccountDetails.class);
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
