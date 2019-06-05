package exoCours;

public class Rectangle extends Forme {

	protected float longueur, largeur;

	// --------------------------------/
	/*
	 * Constructeur Rectangle
	 */
	public Rectangle(float centre, float longueur, float largeur) {
		super(centre);
		this.longueur = longueur;
		this.largeur = largeur;
	}

	// --------Getter-----------------------/

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

}
