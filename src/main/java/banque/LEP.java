package banque;

public class LEP extends Compte {

	private float txInteret;

	public LEP(Particulier particulier, float montant) throws Exception {
		super(particulier, montant);

		this.interet = 0.015F;
	}

	// -----------------@Override------------------------\\
	@Override
	public float getMin() {
		return 30.0f;
	}

	@Override
	public float getMax() {
		return 7700.0f;
	}

	@Override
	public String toString() {
		return super.toString() + ". Le taux d'intérêts est de : " + this.txInteret + "%";
	}

	@Override
	public boolean comptesDecouvert() {
		return false;
	}

}
