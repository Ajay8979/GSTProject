
package com.ojas.gst.returns.entity;

	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	public class Items {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private Integer num;

		@OneToOne(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name="b2b_itmdet_id")
		private ItemDetails itm_det;

		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getNum() {
			return num;
		}

		public void setNum(Integer num) {
			this.num = num;
		}

		public ItemDetails getItm_det() {
			return itm_det;
		}

		public void setItm_det(ItemDetails itm_det) {
			this.itm_det = itm_det;
		}

		

	}

