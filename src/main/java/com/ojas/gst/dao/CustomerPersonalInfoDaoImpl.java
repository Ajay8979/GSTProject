package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerPersonalInfo;

public class CustomerPersonalInfoDaoImpl  extends JpaDao<CustomerPersonalInfo, Long>  implements CustomerPersonalInfoDao{

	public CustomerPersonalInfoDaoImpl() {
		super(CustomerPersonalInfo.class);	
	}

	public CustomerPersonalInfoDaoImpl(Class<CustomerPersonalInfo> entityClass, EntityManager entityManager) {
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
