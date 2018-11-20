package atj.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import atj.service.NbpService;

@Path("/AvgLastN")
public class NbpEndpoint {
	
	private NbpService nbpService;
	
	public NbpEndpoint() {
		nbpService = new NbpService();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
    public NbpAvgLastNDays getAsXML(@PathParam("code") String code, @PathParam("days") int days) {	 
		Double avg;
		try {
			avg = nbpService.getAvgFromLastNDays(code,days);
		} catch (JAXBException e) {
			avg = 0.0;
		}
    	return new NbpAvgLastNDays.Builder().setCode(code).setDays(days).setAvg(avg ).build();
	} 

}
