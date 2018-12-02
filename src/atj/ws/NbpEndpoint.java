package atj.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import atj.service.NbpAvgLastNDays;
import atj.service.NbpService;

@Path("/avg")
public class NbpEndpoint {
		
	@GET
	@Produces({ MediaType.APPLICATION_XML })
	@Path("/valueAsXML")
    public NbpAvgLastNDays getAsXML(@QueryParam("code") String code, @QueryParam("days") int days) {	 
		Double avg = 100.0;
		try {
			NbpService nbpService = new NbpService();			
			avg = nbpService.getAvgFromLastNDays(code,days);
			
		} catch (JAXBException e) {
			avg = 0.0;
		}
    	return new NbpAvgLastNDays(avg,code,days);
	}
	
	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/value")
    public String getAsText(@QueryParam("code") String code, @QueryParam("days") int days) {
		Double avg = 100.0;
		try {
     	   	NbpService nbpService = new NbpService();			
	    	avg = nbpService.getAvgFromLastNDays(code,days);
			} catch (JAXBException e) {
				avg = 0.0;
			}		
    	return String.format("Currency: %s, days: %d, avg = %s" , code, days, avg.toString());
	}
	
	@GET
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/test")
    public String test(@QueryParam("code") String code, @QueryParam("days") int days) {
		return "OK! code="+code+", days="+days;		
	} 

}
