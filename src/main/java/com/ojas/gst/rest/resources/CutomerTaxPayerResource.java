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

import com.ojas.gst.entity.CustomerTaxPayer;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerTaxPayerService;

@Path("/customertaxpayer")
public class CutomerTaxPayerResource {

	@Autowired
	private CustomerTaxPayerService customerTaxPayerService;

	@SuppressWarnings("null")
	@POST
	@Path("/createcTaxpayer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
public Response createTaxPayer(CustomerTaxPayer cus){
		
		//cus.setStatus("Active");
		
		//district.setUpdatedDate(new Date());
		CustomerTaxPayer custaxpayer= customerTaxPayerService.addCustomerTaxPayer(cus);

		if (null != custaxpayer) {
			return new Response(custaxpayer, HttpStatus.CREATED, " taxpayer is created");
		} else {
			return new Response("Unable to create taxpayer", HttpStatus.CONFLICT);
		}
	}
	
	@Path("/getAllTaxPayerList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllDistricts() {

		List<CustomerTaxPayer> taxpayerList =customerTaxPayerService.getAllCustomerTaxPayers() ;

		if (!CollectionUtils.isEmpty(taxpayerList)) {
			return new Response(taxpayerList, HttpStatus.OK, "taxpayer  displayed");
		} else {
			return new Response("Unable to fetch taxpayer", HttpStatus.CONFLICT);
		}
	}
	
	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getTaxPayerById(@PathParam("id") Long id) {

		CustomerTaxPayer customerTaxPayer = customerTaxPayerService.getCustomerTaxPayerById(id);

		if (null != customerTaxPayer) {
			return new Response(customerTaxPayer, HttpStatus.OK, "customerTaxPayer founded Successfully");
		} else {
			return new Response("customerTaxPayer not found", HttpStatus.CONFLICT);
		}
	}
	
	
	
}
