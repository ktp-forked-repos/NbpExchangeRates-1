package atj.ws;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NbpAvgLastNDays {
	
	private Double avg;
	private String code;
	private int days;
	
	private NbpAvgLastNDays(NbpAvgLastNDays.Builder builder) {
		this.avg = builder.avg;
		this.code = builder.code;		
		this.days = builder.days;
	}
	
	public static class Builder {
		
		private Double avg;
		private String code;
		
		private int days;
		
		public Builder() {			
		}
	
		public Builder setAvg(Double avg) {
			this.avg = avg;
			return this;
		}

		public Builder setCode(String code) {
			this.code = code;
			return this;
		}		

		public Builder setDays(int days) {
			this.days = days;
			return this;
		}
		
		public NbpAvgLastNDays build() {
			return new NbpAvgLastNDays(this);
		}
		
		
	}

}
