package com.ojas.gst.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness1;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerAdditionalPlaceOfBusiness1Service;

@Path("/customerAdditionalPlaceofBusi1")
public class CustomerAdditionalPlaceOfBusiness1Resource {

	 @Autowired
		private  CustomerAdditionalPlaceOfBusiness1Service  customerAdditionalPlaceOfBusiness1Service ;
	  @POST
		@Path("/create")
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createCustomerAdditionalPlaceOfBusiness1(CustomerAdditionalPlaceOfBusiness1 cus) {

		  CustomerAdditionalPlaceOfBusiness1 custpinfo = customerAdditionalPlaceOfBusiness1Service.addCustomerAdditionalPlaceOfBusiness1(cus);
			if (null != custpinfo) {
				return new Response(custpinfo, HttpStatus.CREATED, " customer   info  is created");
			} else {
				return new Response("Unable to create customer Detials", HttpStatus.CONFLICT);
			}

		}
		
		@Path("/getAll")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		public Response getAllCustomerAdditionalPlaceOfBusiness1() {
			List<CustomerAdditionalPlaceOfBusiness1> customerList = customerAdditionalPlaceOfBusiness1Service.getAllCustomerAdditionalPlaceOfBusiness1();

			if (!CollectionUtils.isEmpty(customerList)) {	
				return new Response(customerList, HttpStatus.OK, " details  displayed");
			} else {
				return new Response("Unable to fetch details", HttpStatus.CONFLICT);
			}
		}

	
}
