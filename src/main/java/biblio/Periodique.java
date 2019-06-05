package biblio;

public class Periodique extends DocumentPapier {

	/*
	 * Variables spécifiques
	 */
	private int numero;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public Periodique(String titre, String auteur, int nbPages, int numero) {
		super(titre, auteur, nbPages);
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
}
