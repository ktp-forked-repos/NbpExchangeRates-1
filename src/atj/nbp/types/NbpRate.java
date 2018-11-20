package atj.nbp.types;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Rate")
public class NbpRate {
	
	@XmlElement(name="No")
	private String no;
	
	@XmlElement(name="EffectiveDate")
	private String effectiveDate;
	
	@XmlElement(name="Mid")
	private String mid;

	public String getNo() {
		return no;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public String getMid() {
		return mid;
	}	
		
}
