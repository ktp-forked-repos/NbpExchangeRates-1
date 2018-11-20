package atj.nbp.types;

public enum NbpCode {
	
	PLN("pln"), EURO("eur"), GBP("gbp");
	
	private String code;
	
	NbpCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
	
	public static NbpCode get(String code) {
		for(NbpCode c : NbpCode.values()) {
			if (code.equalsIgnoreCase(c.getCode())) {
				return c;
			}
		}
		return null;
	}
}
