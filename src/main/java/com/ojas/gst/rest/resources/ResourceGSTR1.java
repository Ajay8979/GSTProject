package com.ojas.gst.rest.resources;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.returns.entity.B2BAResponse;
import com.ojas.gst.returns.entity.B2BResponse;
import com.ojas.gst.returns.entity.B2CLAResponse;
import com.ojas.gst.returns.entity.B2CLResponse;
import com.ojas.gst.returns.entity.B2CSAResponse;
import com.ojas.gst.returns.entity.B2CSResponse;
import com.ojas.gst.returns.entity.CDNRAResponse;
import com.ojas.gst.returns.entity.CDNRResponse;
import com.ojas.gst.returns.entity.CDNURAResponse;
import com.ojas.gst.returns.entity.CDNURResponse;
import com.ojas.gst.returns.entity.DocResponse;
import com.ojas.gst.returns.entity.EXPAResponse;
import com.ojas.gst.returns.entity.EXPResponse;
import com.ojas.gst.returns.entity.Gstr1Request;
import com.ojas.gst.returns.entity.HSNResponse;
import com.ojas.gst.returns.entity.NilResponse;
import com.ojas.gst.returns.entity.RefferenceId;
import com.ojas.gst.returns.entity.TXPADataResponse;
import com.ojas.gst.returns.entity.TXPResponse;
import com.ojas.gst.service.GSTRService;

@Path("/gstr1")
public class ResourceGSTR1 {

	@Autowired
	private GSTRService serviceImpl;

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RefferenceId gstr1Save(Gstr1Request gstr1Request, @Context HttpServletRequest request) {
		System.out.println(gstr1Request);
		RefferenceId ref_id = new RefferenceId();

		if (gstr1Request != null) {
//			 BigInteger big1 = new BigInteger("1234567856656567242177779");
//		      BigInteger big2 = new BigInteger("12345565678566567131275737372777569");
//
			long min = 100000000;
			long max = 999999999;
			long random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
			gstr1Request.setRef_id("" + random);

			Gstr1Request gstr1 = serviceImpl.save(gstr1Request);
			// Gstr1Request gstr1= b2bService.save(gstr1Request);

			if (gstr1.getRef_id() != null) {
				ref_id.setRef_Id("LAPN" + gstr1.getRef_id());
//			        	return ref_id;
			}

		}
		return ref_id;
	}

	@GET
	@Path("/find/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RefferenceId getGSTR1DataByGSTIn(@PathParam("gstin") String gstin,
			@PathParam("ret_period") String ret_period) {
		RefferenceId gstrByGSTIN = serviceImpl.getGSTRByGSTIN(gstin, ret_period);
		return gstrByGSTIN;

	}

	@GET
	@Path("/findtxpda/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TXPADataResponse getGSTR1TxpdaDataByGSTIn(@PathParam("gstin") String gstin,
			@PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1TxpdaDataByGSTIn(gstin, ret_period);

	}

	@GET
	@Path("/findtotal/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Gstr1Request getGSTR1TxpDataByGSTIn(@PathParam("gstin") String gstin,
			@PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1details(gstin, ret_period);

	}

	@GET
	@Path("/findtxp/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TXPResponse getGSTR1TxpaDataByGSTIn(@PathParam("gstin") String gstin,
			@PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1TxpaDataByGSTIn(gstin, ret_period);

	}

	@GET
	@Path("/findnil/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public NilResponse getGSTR1nil(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1nil(gstin, ret_period);

	}

	@GET
	@Path("/findhsn/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public HSNResponse getGSTR1hsn(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1hsn(gstin, ret_period);

	}

	@GET
	@Path("/findexpa/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EXPAResponse getGSTR1Expa(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1Expa(gstin, ret_period);

	}

	@GET
	@Path("/findexp/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EXPResponse getGSTR1Exp(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1Exp(gstin, ret_period);

	}

	@GET
	@Path("/finddoc/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DocResponse getGSTR1Doc(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1Doc(gstin, ret_period);

	}

	@GET
	@Path("/findcdnura/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CDNURAResponse getGSTR1CDNURA(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1CDNURA(gstin, ret_period);

	}

	@GET
	@Path("/findcdnur/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CDNURResponse getGSTR1CDNUR(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1CDNUR(gstin, ret_period);

	}

	@GET
	@Path("/findcdnra/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CDNRAResponse getGSTR1CDNRA(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1CDNRA(gstin, ret_period);

	}

	@GET
	@Path("/findcdnr/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CDNRResponse getGSTR1CDNR(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1CDNR(gstin, ret_period);

	}

	@GET
	@Path("/findb2csa/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2CSAResponse getGSTR1B2CSA(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2CSA(gstin, ret_period);

	}

	@GET
	@Path("/findb2cs/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2CSResponse getGSTR1B2CS(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2CS(gstin, ret_period);

	}
	
	@GET
	@Path("/findb2cla/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2CLAResponse getGSTR1B2CLA(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2CLA(gstin, ret_period);

	}

	@GET
	@Path("/findb2cl/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2CLResponse getGSTR1B2CL(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2CL(gstin, ret_period);

	}
	
	@GET
	@Path("/findb2ba/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2BAResponse getGSTR1B2BA(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2BA(gstin, ret_period);

	}
	
	@GET
	@Path("/findb2b/{gstin}/{ret_period}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public B2BResponse getGSTR1B2B(@PathParam("gstin") String gstin, @PathParam("ret_period") String ret_period) {
		return serviceImpl.getGSTR1B2B(gstin, ret_period);

	}
}
