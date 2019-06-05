package exoCours;

public class Carre extends Rectangle {

	// --------------------------------/
	/*
	 * Constructeur Carre
	 */
	public Carre(Point centre, float cote) {
		super(centre, cote, cote);
	}

	// --------------@Override------------------/
	@Override
	public String getType() {
		return "Carré";
	}

}
