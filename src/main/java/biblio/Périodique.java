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
	public Périodique(String titre, String auteur, boolean empruntable, float coutDoc, int nbPages, int numero,
			Type type) {
		super(titre, auteur, empruntable, coutDoc, nbPages, type);
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
		return this.empruntable = false;
	}

	@Override
	public String getTypeDocument() {
		return Type.Periodique.getTypeDoc();
	}

}
