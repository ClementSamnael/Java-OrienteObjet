package biblio;

public abstract class Document {

	/*
	 * variables
	 */
	protected String titre;
	protected String auteur;
	protected boolean empruntable;
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

	public boolean isEmpruntable() {
		return empruntable;
	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setEmpruntable(boolean empruntable) {
		this.empruntable = empruntable;
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
