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

import com.ojas.gst.entity.CustomerPersonalInformation;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerPersonalInformationService;

   @Path("/CustomerPersonalInformation")
    public class CustomerPersonalInformationResource {
    @Autowired
	
    private CustomerPersonalInformationService customerPersonalInformationService;
    
	/*
	 * @Autowired private CustomerPersonalInformationDao documentDao;
	 */
    
	/*
	 * @Path("/save")
	 * 
	 * @POST
	 * 
	 * @Consumes(MediaType.MULTIPART_FORM_DATA)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public String
	 * handleFileUploa(@FormDataParam("file") FormDataBodyPart body) throws
	 * Exception {
	 * 
	 * for(BodyPart part : body.getParent().getBodyParts()){ InputStream is =
	 * part.getEntityAs(InputStream.class); ContentDisposition meta =
	 * part.getContentDisposition();
	 * 
	 * CustomerDocument uploadFile = new CustomerDocument();
	 * uploadFile.setImage(StreamUtils.copyToByteArray(is));
	 * documentDao.saveFile(uploadFile); }
	 * 
	 * return "image saved in db Successfully"; }
	 */
    
    
    
    @POST
	@Path("/createBusinessinfo")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomerPersonalInformation(CustomerPersonalInformation cus) {

    	CustomerPersonalInformation custpinfo = customerPersonalInformationService.addCustomerPersonalInformation(cus);

		if (null != custpinfo) {
			return new Response(custpinfo, HttpStatus.CREATED, " customer  Detials  info  is created");
		} else {
			return new Response("Unable to create customer Detials", HttpStatus.CONFLICT);
		}

	}

	@Path("/getAllCustomerPerInfo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllCustomerPersonalInformation() {
		List<CustomerPersonalInformation> customerList = customerPersonalInformationService.getAllCustomerPersonalInformation();

		if (!CollectionUtils.isEmpty(customerList)) {
			return new Response(customerList, HttpStatus.OK, "Personal details  displayed");
		} else {
			return new Response("Unable to fetch Personal details", HttpStatus.CONFLICT);
		}
	}
	
}
