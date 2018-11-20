package atj.nbp.types;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rates")
public class NbpRateList {
	
	@XmlElement(name="rate")
	private ArrayList<NbpRate> rates;

	public ArrayList<NbpRate> getRates() {
		return rates;
	}
	
	
	

}
