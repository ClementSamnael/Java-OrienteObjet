package banque;

public final class Societe extends Proprietaire {

	private String nomGerant;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Societe(String nomProprio, String adrProprio, String nomGerant) {
		super(nomProprio, adrProprio);
		this.nomGerant = nomGerant;
	}

	// -----------------GETTER------------------------\\
	public String getNomGerant() {
		return nomGerant;
	}

	// ---------------SETTER--------------------------\\
	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return super.toString() + ". Le nom de la société est : " + this.nomGerant;
	}

	@Override
	public String getType() {
		return "Societe";
	}
}
