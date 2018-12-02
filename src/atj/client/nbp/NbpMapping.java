package atj.client.nbp;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import atj.nbp.types.NbpCode;
import atj.nbp.types.NbpExchangeRatesSeries;
import atj.nbp.types.NbpTableType;

public class NbpMapping {
	
	public static String exchangeRatesPath = "exchangerates/rates/";
	
	private static String makePath(String baseUrl, String fmt, Object...args) {
		return baseUrl + String.format(fmt, args);
	}
	
	public static String mapToPathTopCount(NbpTableType table, NbpCode code, int topCount ) {
		return 	makePath(exchangeRatesPath, "%s/%s/last/%d", table.getLetter(),code.getCode(), topCount);
	}
	
	public static NbpExchangeRatesSeries mapToNbpSeries(String xml) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(NbpExchangeRatesSeries.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader stringReader = new StringReader(xml);
		return (NbpExchangeRatesSeries) jaxbUnmarshaller.unmarshal( stringReader );
	}

}
