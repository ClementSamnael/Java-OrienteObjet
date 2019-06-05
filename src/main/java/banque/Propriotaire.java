package banque;

import java.util.Date;

public abstract class Propriotaire {

	protected String nomProprio;
	protected String adrProprio;
	protected Date ddnProprio;

//----------------CONSTRUCTEUR-------------------------\\
	public Propriotaire(String nomProprio, String adrProprio, Date ddnProprio) {
		this.nomProprio = nomProprio;
		this.adrProprio = adrProprio;
		this.ddnProprio = ddnProprio;
	}

	// -----------------GETTER------------------------\\
	public String getNomProprio() {
		return nomProprio;
	}

	public String getAdrProprio() {
		return adrProprio;
	}

	public Date getDdnProprio() {
		return ddnProprio;
	}

	// ---------------SETTER--------------------------\\
	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public void setAdrProprio(String adrProprio) {
		this.adrProprio = adrProprio;
	}

	public void setDdnProprio(Date ddnProprio) {
		this.ddnProprio = ddnProprio;
	}

	// ---------------MÉTHODES ABSTARITES--------------------------\\

}
