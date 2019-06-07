package banque;

import java.util.ArrayList;

public abstract class Proprietaire {

	protected String nomProprio;
	protected String adrProprio;
	protected ArrayList<Compte> comptes;

//----------------CONSTRUCTEUR-------------------------\\
	public Proprietaire(String nomProprio, String adrProprio) {
		this.nomProprio = nomProprio;
		this.adrProprio = adrProprio;
		this.comptes = new ArrayList<>();
	}

	// -----------------GETTER------------------------\\
	public String getNomProprio() {
		return nomProprio;
	}

	public String getAdrProprio() {
		return adrProprio;
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	// ---------------SETTER--------------------------\\
	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public void setAdrProprio(String adrProprio) {
		this.adrProprio = adrProprio;
	}

	// ----------------MÉTHODES-------------------------\\
	public abstract String getType();

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return ("Le proprietaire a pour nom : " + this.nomProprio + ", situé au : " + this.adrProprio);
	}

}
