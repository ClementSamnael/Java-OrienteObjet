package banque;

public class LDD extends Compte {

	private final float INTERET = 1 / 100f;

	public LDD(String proprio, int numeroCpt, float montant) {
		super(proprio, numeroCpt, montant);
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
}
