
  package com.ojas.gst.dao;
  
  import javax.persistence.EntityManager;
import
  javax.persistence.PersistenceContext;
import
  javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.ojas.gst.entity.EmailUser;
import com.ojas.gst.entity.Response;
  
  public class EmailDaoImpl extends JpaDao<EmailUser, Long> implements
  EmailDao{
  
  public EmailDaoImpl() { super(EmailUser.class); }
  
  
  private EntityManager entityManager;
  
  public EntityManager getEntityManager() { return this.entityManager; }
  
  @PersistenceContext(type = PersistenceContextType.EXTENDED) public void
  setEntityManager(final EntityManager entityManager) { this.entityManager =
  entityManager; }
  
  @Override public Response saveEmail(EmailUser mail) { Query nativeQuery =
  this.entityManager.createNativeQuery("insert into abc where email =? '");
  return null; }
  
  
  
  
  }
 
 