package exoCours;

public abstract class Forme {

	protected Point centre;

	// -----------Constructeur Forme---------------------/
	public Forme(Point centre) {
		this.centre = centre;
	}

	// --------------GETTER Forme------------------/
	public Point getCentre() {
		return centre;
	}

	// ----------------@Override---------------------/

	@Override
	public String toString() {
		return "Forme de type : " + getType() + " - Perimetre : " + getPerimetre() + " - Aire : " + getAire();
	}

	// --------------MÉTHODES ABSTRAITES------------------/
	public abstract float getAire();

	public abstract float getPerimetre();

	public abstract String getType();

	// --------------MÉTHODES------------------/
	public boolean memeOrigine(Point centreFig) {
		if ((this.centre.getX() == (centreFig.getX())) && (this.centre.getY() == (centreFig.getY())))
			return true;
		return false;
	}

}
