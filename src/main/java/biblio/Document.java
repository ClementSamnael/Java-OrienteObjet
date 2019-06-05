package biblio;

public abstract class Document {

	/*
	 * variables
	 */
	protected String titre;
	protected String auteur;
	protected float coutDoc;

	/*
	 * Constructeur de doc
	 */
	public Document(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;

	}

	// -------------------------------------------------/
	/*
	 * Getter
	 */
	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	// --------------------Setter-----------------------------/
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	// -------------------@Override------------------------------/

	@Override
	public String toString() {
		return this.titre + " - " + this.auteur;
	}

	// -------------------MÉTHODES ABSTRAITES------------------------------/
	/*
	 * Savoir si un documrnt est empruntable ou non
	 */
	public abstract boolean estEmpruntable();

	/*
	 * Connaitre le cout d'un doc
	 */
	public abstract float coutDocument();

}
