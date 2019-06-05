package exoCours;

public class Carre extends Rectangle {

	// --------------------------------/
	/*
	 * Constructeur Carre
	 */
	public Carre(float centre, float cote) {
		super(centre, cote, cote);
	}

	// --------------@Override------------------/
	@Override
	public String getType() {
		return "Carré";
	}

	// -------MÉTHODES-------------------------/
	public boolean estCarre() {
		if (this.longueur == this.largeur)
			return true;
		return false;
	}
}
