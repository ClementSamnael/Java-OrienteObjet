package banque;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Proprietaire {

	protected String nomProprio;
	protected String adrProprio;

	protected static Pattern pattern;
	protected static Matcher matcher;

//----------------CONSTRUCTEUR-------------------------\\
	public Proprietaire(String nomProprio, String adrProprio) {
		this.nomProprio = nomProprio;
		this.adrProprio = adrProprio;
	}

	// -----------------GETTER------------------------\\
	public String getNomProprio() {
		return nomProprio;
	}

	public String getAdrProprio() {
		return adrProprio;
	}

	// ---------------SETTER--------------------------\\
	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public void setAdrProprio(String adrProprio) {
		this.adrProprio = adrProprio;
	}

	// ----------------MÉTHODES-------------------------\\

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return ("Le proprietaire a pour nom : " + this.nomProprio + ", situé au : " + this.adrProprio);
	}

}
