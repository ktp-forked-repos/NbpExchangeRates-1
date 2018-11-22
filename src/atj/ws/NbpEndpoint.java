package atj.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import atj.service.NbpService;

@Path("/avg")
public class NbpEndpoint {
	
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })	
	@Path("/value")
    public NbpAvgLastNDays getAsXML(@QueryParam("code") String code, @QueryParam("days") int days) {	 
		Double avg;
		try {
			NbpService nbpService = new NbpService();			
			avg = nbpService.getAvgFromLastNDays(code,days);
			
		} catch (JAXBException e) {
			avg = 0.0;
		}
    	return new NbpAvgLastNDays.Builder().setCode(code).setDays(days).setAvg(avg ).build();
	}
	
	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/test")
    public String test() {
		return "OK!";		
	} 

}
