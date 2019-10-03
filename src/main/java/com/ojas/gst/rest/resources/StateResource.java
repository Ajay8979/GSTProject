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

import com.ojas.gst.entity.State;
import com.ojas.gst.entity.TaxPayersType;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.StateService;

@Path("/state")
public class StateResource {

	@Autowired
	private StateService stateService;
	
	@POST
	@Path("/createState")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createState(State state) {

		state.setUpdatedDate(new Date());
		state.setStatus("Active");
		State newTaxPayersType = stateService.createState(state);

		if (null != newTaxPayersType) {
			return new Response(newTaxPayersType, HttpStatus.CREATED, "New State is created");
		} else {
			return new Response("Unable to create State", HttpStatus.CONFLICT);
		}
	}
	
	@Path("/getStateList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllStatesList() {

		List<State> taxPayersTypeDTOList = stateService.getAllStates();

		if (!CollectionUtils.isEmpty(taxPayersTypeDTOList)) {
			return new Response(taxPayersTypeDTOList, HttpStatus.OK, "List of States displayed");
		} else {
			return new Response("Unable to fetch States", HttpStatus.CONFLICT);
		}
	}
	
	@PUT
	@Path("/updateState")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateState(State state) {

		state.setStatus("Active");
		state.setUpdatedDate(new Date());

		State updateState = stateService.updateState(state);

		if (null != updateState) {
			return new Response(updateState, HttpStatus.OK, "State Updated Successfully");
		} else {
			return new Response("State not updated", HttpStatus.CONFLICT);
		}
	}
	
	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getStateById(@PathParam("id") Long stateId) {

		State state = stateService.getStateById(stateId);

		if (null != state) {
			return new Response(state, HttpStatus.OK, "State found By Id");
		} else {
			return new Response("State not found", HttpStatus.CONFLICT);
		}
	}
	
	@POST
	@Path("/deleteState")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteState(State state) {	
		/* state.setStatus("Inactive"); */
			int deletedState = stateService.deleteStateById(state);
			if(deletedState != 0) {
				return new Response("State  deleted Successfully", HttpStatus.OK);
			}
			else {
			return new Response("State not deleted", HttpStatus.CONFLICT);
		}
		
	}
	
}
