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

import com.ojas.gst.entity.CustomerPersonalInfo;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerPersonalInfoService;

@Path("/CustomerPersonalInfo")
public class CustomerPersonalInfoResource {

	@Autowired
	private CustomerPersonalInfoService customerPersonalInfoService;

	@POST
	@Path("/createCustomerpinfo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCutomerPersonalInfo(CustomerPersonalInfo cus) {

		
		CustomerPersonalInfo custpinfo = customerPersonalInfoService.addCustomerInfo(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer info  is created");
		} else {
			return new Response("Unable to create customer info", HttpStatus.CONFLICT);
		}

	}

	@Path("/getAllCustomerpesonalinfo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerPersonalInfo() {

		List<CustomerPersonalInfo> customerList = customerPersonalInfoService.getAllPersonalInfo();

		if (!CollectionUtils.isEmpty(customerList)) {
			return new Response(customerList, HttpStatus.OK, "personal info displayed");
		} else {
			return new Response("Unable to fetch Customer personal info details", HttpStatus.CONFLICT);
		}
	}

	@PUT
	@Path("/updateCustomerRegistration")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateCutomerPersonalInfo(CustomerPersonalInfo custObject) {

		CustomerPersonalInfo UpdatedCustPerInfo = customerPersonalInfoService.updatecCustomertPersonalInfo(custObject);

		if (UpdatedCustPerInfo != null) {
			return new Response(UpdatedCustPerInfo, HttpStatus.OK, "ustomer personal info Updated Successfuly");
		} else {
			return new Response("ustomer personal info not updated", HttpStatus.CONFLICT);
		}
	}

	/*
	 * @POST
	 * 
	 * @Path("/delete/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON) public String
	 * deletedeleteCustomerInfoById(@PathParam("id") Long id) {
	 * 
	 * customerPersonalInfoService.d
	 * 
	 * return "record deleted sucessfully"; }
	 */

	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getCustomerPersonalInfoById(@PathParam("id") Long id) {

		CustomerPersonalInfo cregistration = customerPersonalInfoService.getPersonalInfoById(id);

		if (null != cregistration) {
			return new Response(cregistration, HttpStatus.OK, "customer info founded Successfully");
		} else {
			return new Response("customer info not found", HttpStatus.CONFLICT);
		}
	}

}