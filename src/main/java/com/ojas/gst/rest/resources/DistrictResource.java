package com.ojas.gst.rest.resources;

import java.util.Date;
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

import com.ojas.gst.entity.District;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.DistrictService;

@Path("/district")
public class DistrictResource {
	
	@Autowired
	private DistrictService districtService;
	
	
	@POST
	@Path("/createDistrict")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createDistrict(District district) {
		
		district.setStatus("Active");
		
		district.setUpdatedDate(new Date());
		District newDistrict = districtService.createDistrict(district);

		if (null != newDistrict) {
			return new Response(newDistrict, HttpStatus.CREATED, " New Distirct is created");
		} else {
			return new Response("Unable to create New Distirct", HttpStatus.CONFLICT);
		}
	}
	
	@Path("/getAllDistrictsList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllDistricts() {

		List<District> districtList = districtService.getAllDistricts();

		if (!CollectionUtils.isEmpty(districtList)) {
			return new Response(districtList, HttpStatus.OK, "DistrictList displayed");
		} else {
			return new Response("Unable to fetch Districts", HttpStatus.CONFLICT);
		}
	}
	
	@PUT
	@Path("/updateDistrict")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateDistrict(District districtObject) {
		
		districtObject.setStatus("Active");
		districtObject.setUpdatedDate(new Date());
		
		District UpdatedDistrict = districtService.updateDistrict(districtObject);

		if ( UpdatedDistrict != null) {
			return new Response(UpdatedDistrict, HttpStatus.OK, "District Updated Successfuly");
		} else {
			return new Response("District not updated", HttpStatus.CONFLICT);
		}
	}

	
	@POST
	@Path("/deleteDistrict")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteDistrict(District district) {

		 //district.setStatus("Inactive");
		int deletedState = districtService.deleteDistrictById(district);
		if(deletedState != 0) {
			return new Response("District  deleted Successfully", HttpStatus.OK);
		}
		else {
		return new Response("District not deleted", HttpStatus.CONFLICT);
	}
}
	
	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getDistrictById(@PathParam("id") Long districtId) {

		District district = districtService.getDistrictById(districtId);

		if (null != district) {
			return new Response(district, HttpStatus.OK, "District founded Successfully");
		} else {
			return new Response("district not found", HttpStatus.CONFLICT);
		}
	}
	
}
