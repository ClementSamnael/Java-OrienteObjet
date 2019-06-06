package banque;

public class Societe extends Proprietaire {

	private String nomSoc;

	// ----------------CONSTRUCTEUR-------------------------\\
	public Societe(String nomProprio, String adrProprio, String nomSoc) {
		super(nomProprio, adrProprio);
		this.nomSoc = nomSoc;
	}

	// -----------------GETTER------------------------\\
	public String getNomSoc() {
		return nomSoc;
	}

	// ---------------SETTER--------------------------\\
	public void setNomSoc(String nomSoc) {
		this.nomSoc = nomSoc;
	}

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return super.toString() + ". Le nom de la société est : " + this.nomSoc;
	}
}
