package exemple;

public enum Pays {

	// -------------------------------------/
	FR("FR", "France", "Paris"), UK("UK", "United Kingdom", "London");

	// -------------------------------------/
	private String code;
	private String nom;
	private String capital;

	// -------------------------------------/
	private Pays(String code, String nom, String capital) {
		this.code = code;
		this.nom = nom;
		this.capital = capital;
	}

	// -------------------------------------/
	public String getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public String getCapital() {
		return capital;
	}

}
