package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerPersonalInformation;

public class CustomerPersonalInformationDaoImpl extends JpaDao<CustomerPersonalInformation, Long>  implements CustomerPersonalInformationDao{

	


	public CustomerPersonalInformationDaoImpl() {
		super(CustomerPersonalInformation.class);
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

	/*
	 * @Override
	 * 
	 * @Transactional public void saveFile(CustomerDocument uploadFile) {
	 * entityManager.persist(uploadFile); }
	 */

}
