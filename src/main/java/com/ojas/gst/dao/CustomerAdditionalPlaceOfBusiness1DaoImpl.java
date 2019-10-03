package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness1;

public class CustomerAdditionalPlaceOfBusiness1DaoImpl extends JpaDao<CustomerAdditionalPlaceOfBusiness1, Long>  implements CustomerAdditionalPlaceOfBusiness1Dao{


	public CustomerAdditionalPlaceOfBusiness1DaoImpl() {
		super(CustomerAdditionalPlaceOfBusiness1.class);
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
