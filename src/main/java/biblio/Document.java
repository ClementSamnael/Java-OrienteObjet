package biblio;

public abstract class Document {

	/*
	 * variables
	 */
	protected String titre;
	protected String auteur;
	protected boolean empruntable;
	protected float coutDoc;
	protected Type type;

	/*
	 * Constructeur de doc
	 */
	public Document(String titre, String auteur, float coutDoc, Type type) {
		this.titre = titre;
		this.auteur = auteur;
		this.coutDoc = coutDoc;
		this.type = type;
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

	public float getCoutDoc() {
		return coutDoc;
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

	public void setCoutDoc(float coutDoc) {
		this.coutDoc = coutDoc;
	}

	public void setType(Type type) {
		this.type = type;
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

	/*
	 * Récupérer le type de document
	 */
	public abstract String getTypeDocument();

}
