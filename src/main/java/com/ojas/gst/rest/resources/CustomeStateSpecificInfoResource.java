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

import com.ojas.gst.entity.CustomeStateSpecificInfo;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomeStateSpecificInfoService;

@Path("/customerStateSpecificInfo")
public class CustomeStateSpecificInfoResource {

	
	@Autowired
	private CustomeStateSpecificInfoService customeStateSpecificInfoService;
	
	@POST
	@Path("/createBusinessinfo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomeStateSpecificInfo(CustomeStateSpecificInfo cus) {

		CustomeStateSpecificInfo custpinfo = customeStateSpecificInfoService.addCustomeStateSpecificInfo(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer state  info  is created");
		} else {
			return new Response("Unable to create customer state Detials", HttpStatus.CONFLICT);
		}

	}

	@Path("/getAllCutomerBusinessDetail")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomeStateSpecificInfo() {
		List<CustomeStateSpecificInfo> customerList = customeStateSpecificInfoService.getAllCustomeStateSpecificInfo();

		if (!CollectionUtils.isEmpty(customerList)) {
			return new Response(customerList, HttpStatus.OK, "state details  displayed");
		} else {
			return new Response("Unable to fetch state details", HttpStatus.CONFLICT);
		}
	}

	
	
}
