package com.ojas.gst.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import com.ojas.gst.entity.CustomerBusinessDetails;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerBusinessDetailsService;

@Path("/CustomerBusinessDetails")
public class CustomerBusinessDetailsResource {
	@Autowired
	private CustomerBusinessDetailsService customerBusinessDetailsService;

	@POST
	@Path("/createBusinessinfo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCutomerBusinessDetail(CustomerBusinessDetails cus) {

		CustomerBusinessDetails custpinfo = customerBusinessDetailsService.addCustomerBusinessDetails(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer Business Detials  info  is created");
		} else {
			return new Response("Unable to create customer Business Detials", HttpStatus.CONFLICT);
		}

	}

	@Path("/getAllCutomerBusinessDetail")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<CustomerBusinessDetails> customerList = customerBusinessDetailsService.getAllCustomerBusinessDetails();

		if (!CollectionUtils.isEmpty(customerList)) {
			return new Response(customerList, HttpStatus.OK, "Business details  displayed");
		} else {
			return new Response("Unable to fetch business details", HttpStatus.CONFLICT);
		}
	}

	@PUT
	@Path("/updateBusinessDetails")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBusinessDetails(CustomerBusinessDetails custObject) {

		CustomerBusinessDetails UpdatedCustReg = customerBusinessDetailsService
				.updatecCustomerBusinessDetails(custObject);

		if (UpdatedCustReg != null) {
			return new Response(UpdatedCustReg, HttpStatus.OK, "Business Details Updated Successfuly");
		} else {
			return new Response("Business Details not updated", HttpStatus.CONFLICT);
		}
	}

	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getBusinessDetailsById(@PathParam("id") Long id) {

		CustomerBusinessDetails cregistration = customerBusinessDetailsService.getCustomerBusinessDetailsById(id);

		if (null != cregistration) {
			return new Response(cregistration, HttpStatus.OK, "business Details founded Successfully");
		} else {
			return new Response("business Details not found", HttpStatus.CONFLICT);
		}

	}
}
