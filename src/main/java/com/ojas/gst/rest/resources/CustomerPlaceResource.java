package com.ojas.gst.rest.resources;

import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import com.ojas.gst.entity.CustomerPlace;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerPlaceService;

@Path("/CustomerPlace")
public class CustomerPlaceResource {
@Autowired
	private CustomerPlaceService customerPlaceService;
	
@POST
@Path("/createPlace")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public Response createCustomerPlace(CustomerPlace cus) {

	CustomerPlace custpinfo = customerPlaceService.addCustomerPlace(cus);

	if (null != custpinfo) {
		return new Response(custpinfo, HttpStatus.CREATED, " PLACE info  is created");
	} else {
		return new Response("Unable to create PLACE Detials", HttpStatus.CONFLICT);
	}

}

@Path("/getAll")
@GET
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public Response getAllCustomerPlace() {
	List<CustomerPlace> customerList =customerPlaceService.getAllCustomerPlace();

	if (!CollectionUtils.isEmpty(customerList)) {	
		return new Response(customerList, HttpStatus.OK, "PLACE   displayed");
	} else {
		return new Response("Unable to fetch PLACE details", HttpStatus.CONFLICT);
	}
}

@GET
@Path("getById/{id}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public Response getCustomerPlaceById(@PathParam("id") Long id) {

	CustomerPlace cregistration = customerPlaceService.getCustomerPlaceById(id);

	if (null != cregistration) {
		return new Response(cregistration, HttpStatus.OK, "pace Details founded Successfully");
	} else {
		return new Response("place Details not found", HttpStatus.CONFLICT);
	}

}



	
	
}
