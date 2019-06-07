package banque;

//Propretaire physique
public final class Particulier extends Proprietaire {

	private String dateNaissance;// Annee de naissance

	// ----------------CONSTRUCTEUR-------------------------\\
	public Particulier(String nomProprio, String adrProprio, String ddn) {
		super(nomProprio, adrProprio);
		this.dateNaissance = ddn;
	}

	// -----------------GETTER------------------------\\
	public String getDateNaissance() {
		return dateNaissance;
	}

	// ---------------SETTER--------------------------\\
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return super.toString() + ". Ce particulier est né en : " + this.dateNaissance;
	}

	@Override
	public String getType() {
		return "Particulier";
	}
}
