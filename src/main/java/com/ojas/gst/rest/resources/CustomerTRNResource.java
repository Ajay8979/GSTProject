package com.ojas.gst.rest.resources;

import java.util.Random;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;

import com.ojas.gst.entity.CustomerTRN;
import com.ojas.gst.response.Response;
import com.ojas.gst.returns.entity.Gstr1Request;
import com.ojas.gst.returns.entity.RefferenceId;
import com.ojas.gst.service.CustomerTRNService;

@Path("trn")
public class CustomerTRNResource {

	@Autowired
	private CustomerTRNService customerTRNService;

//	public Response createTRN(@RequestBody CustomerTRN customerTRN) {
//
//		// randomNumerber();
//		CustomerTRN ctrn = customerTRNService.addTRN(customerTRN);
//		
//		if (null != ctrn) {
//			CustomerTRN customerTRN1 = new CustomerTRN();
//			customerTRN1.s
//			return new Response(customerTRN, HttpStatus.OK, "trn no added successfully");
//		}
//
//		return new Response(customerTRN, HttpStatus.BAD_REQUEST, "trn no not added");
//
//	}

	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void randomNumerber(@RequestBody CustomerTRN customerTRN) {

		// RefferenceId ref_id = new RefferenceId();

		long min = 100000;
		long max = 999999;
		long random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
		long min1 = 100000;
		long max2 = 999999;
		long random2 = (int) (Math.floor(Math.random() * (max2 - min1 + 1)) + min1);
		String s11 = ("" + random);
		String s22 = ("" + random2);
		customerTRN.setTrnNo(s11 + s22 + "TRN");
		CustomerTRN custTrn = customerTRNService.addTRN(customerTRN);

		custTrn.setTrnNo(s11 + s22 + "TRN");
		System.out.println("sfgweihl" + custTrn);

	}

}
