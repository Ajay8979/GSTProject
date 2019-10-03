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

import com.ojas.gst.entity.CustomerDetailsOfGoods;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerDetailsOfGoodsService;

@Path("/CustomerGoods")
public class CustomerDetailsOfGoodsResource {
  @Autowired
	private CustomerDetailsOfGoodsService CustomerDetailsOfGoods;
  
	
	@POST
	@Path("/createGoods")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomerDetailsOfGoods(CustomerDetailsOfGoods cus) {

		CustomerDetailsOfGoods custpinfo = CustomerDetailsOfGoods.addCustomerDetailsOfGoods(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " good Detials  info  is created");
		} else {
			return new Response("Unable to create c good Detials", HttpStatus.CONFLICT);
		}

	}
	
	@Path("/getAll")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerDetailsOfGoods() {
		List<CustomerDetailsOfGoods> customerList =CustomerDetailsOfGoods.getAllCustomerDetailsOfGoods();

		if (!CollectionUtils.isEmpty(customerList)) {	
			return new Response(customerList, HttpStatus.OK, "good details  displayed");
		} else {
			return new Response("Unable to fetch good details", HttpStatus.CONFLICT);
		}
	}

	@GET
	@Path("getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getCustomerDetailsOfGoodsById(@PathParam("id") Long id) {

		CustomerDetailsOfGoods cregistration = CustomerDetailsOfGoods.CustomerDetailsOfGoodsById(id);

		if (null != cregistration) {
			return new Response(cregistration, HttpStatus.OK, "good Details founded Successfully");
		} else {
			return new Response("good Details not found", HttpStatus.CONFLICT);
		}

	}
  
	
	
}
