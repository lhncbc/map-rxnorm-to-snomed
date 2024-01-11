package gov.nih.nlm.mor.Snomed;

public class SnomedBasisOfSubstanceStrength implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2998946208239644771L;
	private String code = null;
	private String name = null;
	
	public SnomedBasisOfSubstanceStrength(String c, String n) {
		this.code = c;
		this.name = n;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}		

}
