package com.ojas.gst.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.ojas.gst.entity.CustomerRegistration;
import com.ojas.gst.entity.CustomerTRN;

public class CustomerRegistrationDaoImpl extends JpaDao<CustomerRegistration, Long> implements CustomerRegistrationDao {

	public CustomerRegistrationDaoImpl() {
		super(CustomerRegistration.class);
	}

	private EntityManager entityManager;

	public CustomerRegistrationDaoImpl(Class<CustomerRegistration> entityClass, EntityManager entityManager) {
		super(entityClass);
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	

	@Override
	public String getCustomerRegistration1(String email, int otp) {
		Query query = this.entityManager.createNativeQuery(
				"select * from customerreg_details c where c.email = '" + email + "' and c.otp ='" + otp + "'",CustomerRegistration.class);
		@SuppressWarnings("unchecked")
		List<CustomerRegistration> list = query.getResultList();

		for (CustomerRegistration customerRegistration : list) {

			int otp2 = customerRegistration.getOtp();

			if (otp == otp2) {
				return "YOUR OTP VERIFIED SUCCESSFULLY...";
			}
			return "failed";
		}
		return "NOT VERIFIED SEND OTP AGAIN";

	}

	@Override
	public String verifyTRNNo(String email, String trnNo) {

		Query query = this.entityManager.createNativeQuery(
				"select * from customerreg_details c join custtrn t on c.customerTRN_id=t.id where c.email='" + email
						+ "'",
				CustomerTRN.class);

		@SuppressWarnings("unchecked")
		List<CustomerTRN> resultList = query.getResultList();
		for (CustomerTRN customerRegistration : resultList) {

			String trnNo2 = customerRegistration.getTrnNo();
			if (trnNo.equals(trnNo2)) {

				return "trnNo verified successfully....";

			}
			return "failed";
		}
		return null;

	}
}

/*
 * //optional
 * 
 * @SuppressWarnings("null")
 * 
 * @Override public CustomerTRN verifyTRNNo1(String email, String trnNo) { Query
 * query = this.entityManager.createNativeQuery(
 * "select * from customerreg_details c join custtrn t on c.customerTRN_id=t.id where c.email='"
 * + email + "'", CustomerTRN.class);
 * 
 * @SuppressWarnings("unchecked") List<CustomerTRN> resultList =
 * query.getResultList(); CustomerTRN customerTRN = new CustomerTRN(); for
 * (CustomerTRN customerRegistration : resultList) {
 * 
 * String trnNo2 = customerRegistration.getTrnNo();
 * 
 * customerTRN.setTrnNo(trnNo2);
 * 
 * if (trnNo.equals(trnNo2)) {
 * 
 * return
 * 
 * } } return customerTRN; } }
 */
/*
 * @Override public CustomerTRN verifyTRNNo1(String email, String trnNo) {
 * 
 * Query query = this.entityManager.createNativeQuery(
 * "select * from customerreg_details c join custtrn t on c.customerTRN_id=t.id where c.email='"
 * + email + "'",CustomerTRN.class);
 * 
 * @SuppressWarnings("unchecked") List<CustomerTRN> resultList =
 * query.getResultList();
 * 
 * for (CustomerTRN customerRegistration : resultList) {
 * 
 * String trnNo2 = customerRegistration.getTrnNo(); if (trnNo.equals(trnNo2) ){
 * 
 * return "trnNo verified successfully....";
 * 
 * } return "failed"; } return null;
 */

/*
 * @Override public String verifyTRNNo(Long id, String trnNo) {
 * 
 * Query query = this.entityManager.createNativeQuery(
 * "select  c.id,c.trnNo from custtrn c where c.id = '" + id +
 * "' and c.trnNo ='" + trnNo + "'", CustomerTRN.class);
 * 
 * @SuppressWarnings("unchecked") List<CustomerTRN> resultList =
 * query.getResultList();
 * 
 * for (CustomerTRN customerRegistration : resultList) {
 * 
 * String trnNo2 = customerRegistration.getTrnNo(); if (trnNo == trnNo2) {
 * 
 * return "sucess";
 * 
 * } return "failed"; } return "uncecessfull";
 * 
 * }
 */

/*
 * @Override public String verifyTRNNo(Long id, String trnNo) { final
 * CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder(); final
 * CriteriaQuery<CustomerTRN> criteriaQuery =
 * builder.createQuery(CustomerTRN.class); Root<CustomerTRN> root =
 * criteriaQuery.from(CustomerTRN.class); // Path<String> namePath =
 * root.get("user"); Path<String> tokenPath = root.get("trnNo");
 * criteriaQuery.where(builder.equal(tokenPath, id));
 * 
 * TypedQuery<CustomerTRN> typedQuery =
 * this.getEntityManager().createQuery(criteriaQuery); CustomerTRN accessToken =
 * typedQuery.getSingleResult(); return "ok"; }
 */

/*
 * @SuppressWarnings("unchecked")
 * 
 * @Override public CustomerTRN getCustomerTRN(int id, String trnNo) { Query
 * query = this.entityManager.createNativeQuery(
 * "select * from customerreg_details c where c.id = '" + id +
 * "' and c.trnNo ='" + trnNo + "'", CustomerTRN.class); CustomerTRN list =
 * (CustomerTRN) query.getResultList(); if (!((List<CustomerTRN>)
 * list).isEmpty()) { return list; } return null; }
 */
/*
 * public CustomerRegistration findCustomerRegistration1(String email,int otp) {
 * final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
 * final CriteriaQuery<CustomerRegistration> criteriaQuery =
 * builder.createQuery(CustomerRegistration.class); Root<CustomerRegistration>
 * root = criteriaQuery.from(CustomerRegistration.class); Path<String> namePath
 * = root.get("email"); Path<String> tokenPath = root.get("otp");
 * criteriaQuery.where(builder.equal(namePath, email));
 * criteriaQuery.where(builder.equal(tokenPath, otp));
 * 
 * TypedQuery<CustomerRegistration> typedQuery =
 * this.getEntityManager().createQuery(criteriaQuery); CustomerRegistration
 * customerRegistration = typedQuery.getSingleResult(); return
 * customerRegistration;
 * 
 * }
 */

/*
 * @Override public String getCustomerRegistration1(String email, int otp) { //
 * TODO Auto-generated method stub return null; }
 */