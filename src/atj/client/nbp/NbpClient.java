package atj.client.nbp;


import javax.xml.bind.JAXBException;

import atj.client.FeignClient;
import atj.nbp.types.NbpCode;
import atj.nbp.types.NbpExchangeRatesSeries;
import atj.nbp.types.NbpTableType;

public class NbpClient  
{
	private static final String NBP_API_URI = "http://api.nbp.pl/api/"; 	
	
	private FeignClient client;

	public NbpClient() {
		client = new FeignClient();
		client.create(NBP_API_URI);		
	}
	
	//http://api.nbp.pl/api/exchangerates/rates/{table}/{code}/last/{topCount}/
	public NbpExchangeRatesSeries askTopCount(NbpTableType table, NbpCode code, int topCount) throws JAXBException {
		String requestPath = NbpMapping.mapToPathTopCount(table, code, topCount);
		String response = client.getXMLResponse(requestPath);
		NbpExchangeRatesSeries series = NbpMapping.mapToNbpSeries(response);
		return series;
	}
}
