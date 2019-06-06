package banque;

public class LEP extends Compte {

	private final float INTERET = 1.5f / 100f;

	public LEP(String proprio, int numeroCpt, float montant) {
		super(proprio, numeroCpt, montant);
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

}
