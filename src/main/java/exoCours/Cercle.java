package exoCours;

public class Cercle extends Forme {

	private float rayon;

	// --------------------------------/
	/*
	 * Constructeur Cercle
	 */
	public Cercle(Point centre, float rayon) {
		super(centre);
		this.rayon = rayon;
	}

	// ----------GETTER CERCLE---------------------/

	public float getRayon() {
		return rayon;
	}

	// ---------- @Override---------------------/

	@Override
	public float getAire() {
		return (float) (Math.PI * Math.pow(rayon, 2));
	}

	@Override
	public float getPerimetre() {
		return (float) (2 * Math.PI * rayon);
	}

	@Override
	public String getType() {
		return "Cercle";
	}

}
