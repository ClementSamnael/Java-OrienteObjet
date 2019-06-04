package biblio;

public class Périodique extends DocumentPapier {

	/*
	 * Variables spécifiques
	 */
	private int numero;

	/*
	 * Constructeur
	 */
	public Périodique(String titre, String auteur, boolean empruntable, float coutDocEcrit, int nbPages, int numero) {
		super(titre, auteur, empruntable, coutDocEcrit, nbPages);
		this.numero = numero;
	}

	/*
	 * Getter
	 */
	public int getNumero() {
		return numero;
	}

	/*
	 * Setter
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
