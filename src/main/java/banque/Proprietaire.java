package banque;

public abstract class Proprietaire {

	protected String nomProprio;
	protected String adrProprio;

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

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return ("Le proprietaire a pour nom : " + this.nomProprio + ", il vit a : " + this.adrProprio);
	}
}
