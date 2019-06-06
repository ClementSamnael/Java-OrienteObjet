package banque;

//Propretaire physique
public class Particulier extends Proprietaire {

	private int dateNaissance;// Annee de naissance

	// ----------------CONSTRUCTEUR-------------------------\\
	public Particulier(String nomProprio, String adrProprio, int ddn) {
		super(nomProprio, adrProprio);
		this.dateNaissance = ddn;
	}

	// -----------------GETTER------------------------\\
	public int getDateNaissance() {
		return dateNaissance;
	}

	// ---------------SETTER--------------------------\\
	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	// -------------@Override----------------------------\\
	@Override
	public String toString() {
		return super.toString() + ". Ce particulier est né en : " + this.dateNaissance;
	}
}
