package atj.nbp.types;

public enum NbpTableType {
	
	TableA("A"), TableB("B"), TableC("C");
	
	private String letter;
	
	NbpTableType(String letter) {
		this.letter = letter;
	}
	
	public String getLetter() {
		return this.letter;
	}
	
	public static NbpTableType get(String letter) {
		for(NbpTableType c : NbpTableType.values()) {
			if (letter.equals(c.getLetter())) {
				return c;
			}
		}
		return null;
	}

}
