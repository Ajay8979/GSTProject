package com.ojas.gst.rest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import com.ojas.gst.entity.CustomerAuthorizedRepresentative;
import com.ojas.gst.response.Response;
import com.ojas.gst.service.CustomerAuthorizedRepresentativeService;

@Path("/AuthorizedRepresentative")
public class CustomerAuthorizedRepresentativeResource {
    @Autowired(required=true)
    private CustomerAuthorizedRepresentativeService authorizedService;

 

    @POST
    @Path("/createAuthorizedS")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAuthorizedRepresentative(CustomerAuthorizedRepresentative customer) {
        
    	CustomerAuthorizedRepresentative authorizedRepresentative=authorizedService.addAuthorizedRepresentative(customer);
        if (null != authorizedRepresentative) {
            return new Response(authorizedRepresentative, HttpStatus.CREATED, " New Distirct is created");
        } else {
            return new Response("Unable to create New Distirct", HttpStatus.CONFLICT);
        }
        }
    
    @GET
    @Path("/getAllAuthorizedRepresentative")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getAllAuthorizedRepresentativeDetails() {

 

        List<CustomerAuthorizedRepresentative> authoRepList = authorizedService.getAllAuthorizedRepresentative();

 

        if (!CollectionUtils.isEmpty(authoRepList)) {
            return new Response(authoRepList, HttpStatus.OK, "DistrictList displayed");
        } else {
            return new Response("Unable to fetch Authorized Representative details", HttpStatus.CONFLICT);
        }
    }
    
    
    

 

 

    @PUT
    @Path("/updateAuthorizedRepresentative")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAuthorizedRepresentative(CustomerAuthorizedRepresentative custObject) {

 

    	CustomerAuthorizedRepresentative AuthoRepReg = authorizedService.updatecAuthorizedRepresentative(custObject);

 

        if (AuthoRepReg != null) {
            return new Response(AuthoRepReg, HttpStatus.OK, "District Updated Successfuly");
        } else {
            return new Response("Authorized Representative not updated", HttpStatus.CONFLICT);
        }
    }
    
    
    
    
    
@POST
@Path("/deleteAuthorizedRepresentative")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public String deletedeleteAuthorizedRepresentativeById(CustomerAuthorizedRepresentative cr) {
    /* state.setStatus("Inactive"); */
    authorizedService.deleteAuthorizedRepresentativeById(cr);
    return "record deleted sucessfully";
    
}
}