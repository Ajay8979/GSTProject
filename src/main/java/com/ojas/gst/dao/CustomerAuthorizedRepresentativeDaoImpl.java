package com.ojas.gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.ojas.gst.entity.CustomerAuthorizedRepresentative;

public class CustomerAuthorizedRepresentativeDaoImpl extends JpaDao<CustomerAuthorizedRepresentative, Long>
implements CustomerAuthorizedRepresentativeDao {





public CustomerAuthorizedRepresentativeDaoImpl() {
		super(CustomerAuthorizedRepresentative.class);
		// TODO Auto-generated constructor stub
	}



private EntityManager entityManager;

@Override
public EntityManager getEntityManager() {
return this.entityManager;
}



@PersistenceContext(type = PersistenceContextType.EXTENDED)
public void setEntityManager(final EntityManager entityManager) {
this.entityManager = entityManager;
 }
}