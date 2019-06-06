package banque;

public final class LDD extends Compte {

	private float txInteret;

	public LDD(Proprietaire proprio, float montant) throws Exception {
		super(proprio, montant);
		this.interet = 0.01F;
	}

	// -----------------@Override------------------------\\
	@Override
	public float getMin() {
		return 15.0f;
	}

	@Override
	public float getMax() {
		return 12000.0f;
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
