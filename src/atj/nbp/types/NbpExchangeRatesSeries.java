package atj.nbp.types;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ExchangeRatesSeries")
public class NbpExchangeRatesSeries {
	
	@XmlElement(name="Table")
	private String tableType;
	
	@XmlElement(name="Currency")	
	private String currency;
	
	@XmlElement(name="Code")	
	private String code;
	
	@XmlElementWrapper(name = "Rates") 
	@XmlElement(name="Rate")
	private List<NbpRate> rates = null;

	public String getTableType() {
		return tableType;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCode() {
		return code;
	}

	public List<NbpRate> getRates() {
		return rates;
	}



}
