package com.ojas.gst.rest.resources;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Path("/CustomerPhotographUpload")
public class CustomerPhotographUploadResource {

	/*
	 * @Autowired private CustomerImageDao dao;
	 */
	
	@POST
	@Path("/uploadphoto")
    @Consumes(MediaType.ALL_VALUE)	
	public ResponseEntity<Object>  uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
		File convertFile = new File("C:\\download\\"+file.getOriginalFilename());
		convertFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(convertFile);
		fout.write(file.getBytes());
		fout.close();
		return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
		
		
	}	
	
	
	/*
		 * Public ResponseEntity<Object> save(@RequestParam("photo") MultipartFile photo)
		 * throws IOException { dao.inserRecords(photo); return new
		 * ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
		 */
}
	

