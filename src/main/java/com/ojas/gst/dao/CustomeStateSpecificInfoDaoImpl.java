package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomeStateSpecificInfo;

public class CustomeStateSpecificInfoDaoImpl extends JpaDao<CustomeStateSpecificInfo, Long>  implements CustomeStateSpecificInfoDao{

	
	
	public CustomeStateSpecificInfoDaoImpl() {
		super(CustomeStateSpecificInfo.class);
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
