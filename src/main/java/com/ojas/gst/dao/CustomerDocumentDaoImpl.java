package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import com.ojas.gst.entity.CustomerDocument;

public class CustomerDocumentDaoImpl extends JpaDao<CustomerDocument, Long> implements CustomerDocumentDao{

	public CustomerDocumentDaoImpl() {
		super(CustomerDocument.class);
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
	  @Transactional
	public void saveFile(CustomerDocument uploadFile) {
		     entityManager.persist(uploadFile);
	}
	}
	
		
	

