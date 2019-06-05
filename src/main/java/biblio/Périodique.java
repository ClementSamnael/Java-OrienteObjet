package biblio;

public class Périodique extends DocumentPapier {

	/*
	 * Variables spécifiques
	 */
	private int numero;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public Périodique(String titre, String auteur, float coutDoc, int nbPages, int numero, Type type) {
		super(titre, auteur, coutDoc, nbPages, type);
		this.numero = numero;
	}

	// -------------------------------------------------/
	/*
	 * Getter
	 */
	public int getNumero() {
		return numero;
	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	// -----------------MÉTHODES-------------------------------/
	@Override
	public boolean estEmpruntable() {
		return false;
	}

	@Override
	public String getTypeDocument() {
		return Type.Livre.choixType();
	}
}
