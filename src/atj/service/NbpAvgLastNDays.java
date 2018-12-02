package atj.service;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NbpAvgLastNDays")
public class NbpAvgLastNDays implements Serializable {	

	private Double avg;

	private String code;

	private int days;
	
	public NbpAvgLastNDays() {	
	}
	
	public NbpAvgLastNDays(Double avg, String code, int days) {
		this.avg = avg;
		this.code = code;		
		this.days = days;
	}

	@XmlElement
	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	@XmlElement
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	

}
