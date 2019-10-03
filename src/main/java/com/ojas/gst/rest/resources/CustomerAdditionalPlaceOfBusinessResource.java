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

import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerAdditionalPlaceOfBusinessService;
@Path("/customerAdditionalPlaceofBusi")
public class CustomerAdditionalPlaceOfBusinessResource {
  @Autowired
	private CustomerAdditionalPlaceOfBusinessService customerAdditionalPlaceOfBusinessService;
  
  @POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomerAdditionalPlaceOfBusiness(CustomerAdditionalPlaceOfBusiness cus) {

	  CustomerAdditionalPlaceOfBusiness custpinfo = customerAdditionalPlaceOfBusinessService.addCustomerAdditionalPlaceOfBusiness(cus);
		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer  Detials  info  is created");
		} else {
			return new Response("Unable to create customer Detials", HttpStatus.CONFLICT);
		}

	}
	
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerAdditionalPlaceOfBusiness() {
		List<CustomerAdditionalPlaceOfBusiness> customerList = customerAdditionalPlaceOfBusinessService.getCustomerAdditionalPlaceOfBusiness();

		if (!CollectionUtils.isEmpty(customerList)) {	
			return new Response(customerList, HttpStatus.OK, " details  displayed");
		} else {
			return new Response("Unable to fetch details", HttpStatus.CONFLICT);
		}
	}

  
  
	
}
