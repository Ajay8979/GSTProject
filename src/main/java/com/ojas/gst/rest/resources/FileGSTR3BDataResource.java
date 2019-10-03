package com.ojas.gst.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.entity.FileGSTR3BData;
import com.ojas.gst.entity.GSTR3BEntity;
import com.ojas.gst.entity.RefferenceId;
import com.ojas.gst.service.FileGSTR3BDataService;

@Path("/FileGSTR3BData")
public class FileGSTR3BDataResource {

	@Autowired
	private FileGSTR3BDataService fileGSTR3BDataService;

	@POST
	@Path("/createFileGSTR3BData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RefferenceId createUser(FileGSTR3BData fileGSTR3BData) {
		FileGSTR3BData saveFileGSTR3BData = null;
		int min = 100000;
		int max = 999999;
		int random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
		fileGSTR3BData.setRef_id("" + random);
		RefferenceId refferenceId = new RefferenceId();
		if (null != fileGSTR3BData) {
			saveFileGSTR3BData = fileGSTR3BDataService.saveFileGSTR3BData(fileGSTR3BData);
			String ref_id = saveFileGSTR3BData.getRef_id();
			refferenceId.setRef_id(ref_id);
			return refferenceId;
		}
		return null;

	}

	@POST
	@Path("/findGSTR3BDataBYJSTIN")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RefferenceId getGSTR3BDataByGSTIn(GSTR3BEntity gstr3bEntity) {
		RefferenceId gstrByGSTIN = fileGSTR3BDataService.getGSTRByGSTIN(gstr3bEntity);
		return gstrByGSTIN;

	}

	@GET
	@Path("/GetGSTR3BDataBYJSTIN/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FileGSTR3BData getGSTR3BData(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		GSTR3BEntity gstr3bEntity = new GSTR3BEntity();
		gstr3bEntity.setGstin(gstin);
		gstr3bEntity.setRet_period(ret_period);
		FileGSTR3BData data = fileGSTR3BDataService.getGSTR(gstr3bEntity);

		return data;

	}

}
