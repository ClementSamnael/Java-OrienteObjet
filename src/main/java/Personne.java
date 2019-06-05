

import java.util.Date;

public abstract class Personne {

	protected String nomPers;
	protected String adrPers;
	protected Date ddnPers;

	// -----------------------CONSTRUCTEUR--------------------\\
	public Personne(String nomPers, String adrPers, Date ddnPers) {
		this.nomPers = nomPers;
		this.adrPers = adrPers;
		this.ddnPers = ddnPers;
	}

	// ----------GETTER----------------------------------\\
	public String getNomPers() {
		return nomPers;
	}

	public String getAdrPers() {
		return adrPers;
	}

	public Date getDdnPers() {
		return ddnPers;
	}

	// ----------SETTER----------------------------------\\
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public void setAdrPers(String adrPers) {
		this.adrPers = adrPers;
	}

	public void setDdnPers(Date ddnPers) {
		this.ddnPers = ddnPers;
	}
	// ----------MÉTHODES ABSTRAITES----------------------------------\\

}
