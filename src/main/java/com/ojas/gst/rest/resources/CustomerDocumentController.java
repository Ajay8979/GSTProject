
package com.ojas.gst.rest.resources;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.BodyPart;
import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StreamUtils;

import com.ojas.gst.dao.CustomerDocumentDao;
import com.ojas.gst.entity.CustomerDocument;

@Path("/saveImage")
public class CustomerDocumentController {

	@Autowired
	private CustomerDocumentDao documentDao;

	@Path("/save")
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public String handleFileUploa(@FormDataParam("file") FormDataBodyPart body) throws Exception {
		 
     
		
		for(BodyPart part : body.getParent().getBodyParts()){
	        InputStream is = part.getEntityAs(InputStream.class);
	        ContentDisposition meta = part.getContentDisposition();
	        
	        CustomerDocument uploadFile = new CustomerDocument();
			uploadFile.setImage(StreamUtils.copyToByteArray(is));
			documentDao.save(uploadFile);
	    }

		return "image saved in db Successfully";
		}

}































		/*
		 * 
		 * public String handleFileUploa(@RequestParam("file") MultipartForm fileUpload) throws Exception {
		
		 * if (fileUpload != null && fileUpload.length > 0) {
			
			for (MultipartFile aFile : fileUpload) {
				System.out.println("Saving file: " + aFile.getOriginalFilename());
				CustomerDocument uploadFile = new CustomerDocument();
				uploadFile.setImage(aFile.getBytes());
				documentDao.save(uploadFile);
			}
		}*/

	

