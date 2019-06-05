package biblio;

public enum Type {
	DVD("DVD"), Blu_Ray("Blu_Ray"), Blu_Ray_3D("Blu_Ray_3D"), Periodique("Periodique"), Livre("Livre");

	private String typeDoc = "";

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	private Type(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	// -------------------------------------------------/
	/*
	 * Getter
	 */
	public String getTypeDoc() {
		return typeDoc;
	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	// -------------------------------------------------/
	@Override
	public String toString() {
		return ("Le type de Vidéo chois : " + typeDoc);
	}
}
