package banque;

public class Societe {

	protected String nomSoc;
	protected String adrSoc;
	protected Propriotaire gerantSoc;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Societe(String nomSoc, String adrSoc, Propriotaire gerantSoc) {
		this.nomSoc = nomSoc;
		this.adrSoc = adrSoc;
		this.gerantSoc = gerantSoc;
	}

	// ----------------GETTER-------------------------\\
	public String getNomSoc() {
		return nomSoc;
	}

	public String getAdrSoc() {
		return adrSoc;
	}

	public Propriotaire getGerantSoc() {
		return gerantSoc;
	}

	// ----------------SETTER-------------------------\\
	public void setNomSoc(String nomSoc) {
		this.nomSoc = nomSoc;
	}

	public void setAdrSoc(String adrSoc) {
		this.adrSoc = adrSoc;
	}

	public void setGerantSoc(Propriotaire gerantSoc) {
		this.gerantSoc = gerantSoc;
	}

}
