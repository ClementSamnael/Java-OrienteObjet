package exoCours;

public class Rectangle extends Forme {

	protected float longueur, largeur;

	// --------------------------------/
	/*
	 * Constructeur Rectangle
	 */
	public Rectangle(Point centre, float longueur, float largeur) {
		super(centre);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	// --------GETTER RECTANGLE-----------------------/

	public float getLongueur() {
		return longueur;
	}

	public float getLargeur() {
		return largeur;
	}
	// ------------@Override--------------------/

	@Override
	public float getAire() {
		return longueur * largeur;
	}

	@Override
	public float getPerimetre() {
		return (longueur + largeur) * 2;
	}

	@Override
	public String getType() {
		return "Rectangle";
	}

	// -------MÉTHODES-------------------------/
	public boolean estCarre() {
		if (this.longueur == this.largeur)
			return true;
		return false;
	}
}
