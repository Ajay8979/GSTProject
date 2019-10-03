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

import com.ojas.gst.entity.CustomerBankAccountDetails;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerBankAccountDetailsService;
@Path("/customerBankAccountDetails")
public class CustomerBankAccountDetailsResource {
	@Autowired
	private CustomerBankAccountDetailsService customerBankAccountDetailsService;
	
	
	@POST
	@Path("/createBankAccount")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomerBankAccountDetails(CustomerBankAccountDetails cus) {

		CustomerBankAccountDetails custpinfo = customerBankAccountDetailsService.addCustomerBankAccountDetails(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer Bank Detials  info  is created");
		} else {
			return new Response("Unable to create customer Bank Detials", HttpStatus.CONFLICT);
		}

	}
	
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerBankAccountDetails() {
		List<CustomerBankAccountDetails> customerList = customerBankAccountDetailsService.getAllCustomerBankAccountDetails();

		if (!CollectionUtils.isEmpty(customerList)) {	
			return new Response(customerList, HttpStatus.OK, "Bank details  displayed");
		} else {
			return new Response("Unable to fetch bank details", HttpStatus.CONFLICT);
		}
	}

	
	
	

}
