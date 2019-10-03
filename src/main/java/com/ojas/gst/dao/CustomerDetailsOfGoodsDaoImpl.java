package com.ojas.gst.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import com.ojas.gst.entity.CustomerDetailsOfGoods;

public class CustomerDetailsOfGoodsDaoImpl extends JpaDao<CustomerDetailsOfGoods, Long>
		implements CustomerDetailsOfGoodsDao {

	public CustomerDetailsOfGoodsDaoImpl() {
		super(CustomerDetailsOfGoods.class);
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
	 * @Override public CustomerDetailsOfGoods findByName(String goodname) {
	 * 
	 * Query createNativeQuery = this.entityManager.
	 * createNativeQuery("select * from custgood_info where name='"+goodname+"'");
	 * 
	 * List<CustomerDetailsOfGoods> resultList = createNativeQuery.getResultList();
	 * 
	 * for( CustomerDetailsOfGoods cust:resultList) {
	 * 
	 * } return null; }
	 * 
	 */
	
	
	
	
	
	
	@Override
	public CustomerDetailsOfGoods findByName(String goodname) {
		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<CustomerDetailsOfGoods> criteriaQuery = builder.createQuery(this.entityClass);

		Root<CustomerDetailsOfGoods> root = criteriaQuery.from(this.entityClass);
		Path<String> namePath = root.get("goodname");
		criteriaQuery.where(builder.equal(namePath, goodname));

		TypedQuery<CustomerDetailsOfGoods> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		List<CustomerDetailsOfGoods> users = typedQuery.getResultList();

		if (users.isEmpty()) {
			return null;
		}

		return users.iterator().next();
	}
	
	
	
	
	
	
	
	
	
}
