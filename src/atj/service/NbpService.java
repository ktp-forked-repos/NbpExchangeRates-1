package atj.service;

import javax.xml.bind.JAXBException;

import atj.client.nbp.NbpClient;
import atj.nbp.NbpTools;
import atj.nbp.types.NbpCode;
import atj.nbp.types.NbpExchangeRatesSeries;
import atj.nbp.types.NbpTableType;

public class NbpService {	
	
	private NbpClient nbpClient;
	
	public NbpService() {
		nbpClient = new NbpClient();
	}
	
	public Double getAvgFromLastNDays(String code, int topCount) throws JAXBException  {
		NbpExchangeRatesSeries series = nbpClient.askTopCount(NbpTableType.TableA, NbpCode.get(code), topCount); 
		return NbpTools.calculateAverage(series);
	}

}
