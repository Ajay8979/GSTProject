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

import com.ojas.gst.entity.CustomerPlaceOfBusiness;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerPlaceOfBusinessService;

@Path("/CustomerPersonalInfo")
public class CustomerPlaceOfBusinessResource {
	@Autowired
private CustomerPlaceOfBusinessService customerPlaceOfBusinessService;
	
	@POST
	@Path("/createCustomerBusiness")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createCustomerPlaceOfBusiness(CustomerPlaceOfBusiness cpob) {
		CustomerPlaceOfBusiness cplaceofbusiness=customerPlaceOfBusinessService.addCustomerPlaceOfBusiness(cpob);
		
			if (null != cplaceofbusiness) {
				return new Response(cplaceofbusiness, HttpStatus.CREATED, " customer place Business Detials   is created");
			} else {
				return new Response("Unable to create customer Business place Detials", HttpStatus.CONFLICT);
			}
		
		
	}
	
	
	@Path("/getAllCustomerBusiness")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerBusiness() {

		List<CustomerPlaceOfBusiness> customerList = customerPlaceOfBusinessService.getAllCustomerPlaceOfBusiness();

		if (!CollectionUtils.isEmpty(customerList)) {
			return new Response(customerList, HttpStatus.OK, "Business  info displayed");
		} else {
			return new Response("Unable to fetch Customer Business info details", HttpStatus.CONFLICT);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
