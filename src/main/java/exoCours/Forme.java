package exoCours;

public abstract class Forme {

	protected float centre;

	// --------------------------------/
	/*
	 * Constructeur Forme
	 */
	public Forme(float centre) {
		this.centre = centre;
	}

	// --------------Getter Forme------------------/
	public float getCentre() {
		return centre;
	}

	// -------------------------------------/
	@Override
	public String toString() {
		return "Forme de type : " + getType() + "Perimetre : " + getPerimetre() + " Aire : " + getAire();
	}

	// --------------Methodes abstraites------------------/
	public abstract float getAire();

	public abstract float getPerimetre();

	public abstract String getType();

	// --------------Methodes------------------/
	public boolean memeOrigine(float centreFig) {
		if (this.centre == centreFig)
			return true;
		return false;
	}

}
