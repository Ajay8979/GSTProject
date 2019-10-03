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

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import com.ojas.gst.dto.TaxPayersTypeDTO;
import com.ojas.gst.entity.TaxPayersType;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.TaxPayersTypeService;

@Path("/type")
public class TaxPayersTypeResource {
	
	@Autowired
	private TaxPayersTypeService taxPayersTypeService;

	
	@POST
	@Path("/createTaxPayersType")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTaxPayersType(TaxPayersTypeDTO taxPayersTypeDTO) {

		TaxPayersType taxPayersType = new TaxPayersType();

		BeanUtils.copyProperties(taxPayersTypeDTO, taxPayersType);
        
		taxPayersType.setStatus("Active");
		taxPayersType.setTaxpayerstypeName(taxPayersTypeDTO.getTaxPayersType());

		taxPayersType.setUpdatedDate(new Date());
		TaxPayersType newTaxPayersType = taxPayersTypeService.createTaxPayersType(taxPayersType);

		if (null != newTaxPayersType) {
			return new Response(newTaxPayersType, HttpStatus.CREATED, "newTaxPayersType is created");
		} else {
			return new Response("Unable to create newTaxPayersType", HttpStatus.CONFLICT);
		}
	}

	@Path("/getTaxPayersTypeList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllTaxPayersTypes() {

		List<TaxPayersTypeDTO> taxPayersTypeDTOList = taxPayersTypeService.getAllTaxPayersTypes();

		if (!CollectionUtils.isEmpty(taxPayersTypeDTOList)) {
			return new Response(taxPayersTypeDTOList, HttpStatus.OK, "TaxPayersTypeList displayed");
		} else {
			return new Response("Unable to fetch categories", HttpStatus.CONFLICT);
		}
	}
	
	@PUT
	@Path("/updateTaxPayersType")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateTaxPayersType(TaxPayersTypeDTO taxPayersTypeDTO) {

		TaxPayersType taxPayersType = new TaxPayersType();

		BeanUtils.copyProperties(taxPayersTypeDTO, taxPayersType);

		taxPayersType.setStatus("Active");
		taxPayersType.setTaxpayerstypeName(taxPayersTypeDTO.getTaxPayersType());

		taxPayersType.setUpdatedDate(new Date());

		TaxPayersType updatedTaxPayersType = taxPayersTypeService.updateTaxPayersType(taxPayersType);

		if (updatedTaxPayersType != null) {
			return new Response(updatedTaxPayersType, HttpStatus.OK, "updated TaxPayersType");
		} else {
			return new Response("TaxPayersType not updated", HttpStatus.CONFLICT);
		}
	}

	
	@POST
	@Path("/deleteCategory")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteTaxPayersType(TaxPayersType taxPayersType) {

		/* taxPayersType.setStatus("Inactive"); */
		int deletedTaxPayersType = taxPayersTypeService.deleteTaxPayersTypeById(taxPayersType);
		if(deletedTaxPayersType != 0) {
			return new Response("TaxPayersType  deleted Successfully", HttpStatus.OK);
		}
		else {
		return new Response("TaxPayersType not deleted", HttpStatus.CONFLICT);
	}
	}
	
	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getTaxPayersTypeById(@PathParam("id") Long taxPayersTypeId) {

		TaxPayersType taxPayersType = taxPayersTypeService.getTaxPayersTypeById(taxPayersTypeId);

		if (null != taxPayersType) {
			return new Response(taxPayersType, HttpStatus.OK, "TaxPayersType found");
		} else {
			return new Response("TaxPayersType not found", HttpStatus.CONFLICT);
		}
	}

}
