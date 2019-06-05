package biblio;

public enum Type {
	DVD("DVD"), Blu_Ray("Blu Ray"), Blu_Ray_3D("Blu Ray 3D"), Periodique("Periodique"), Livre("Livre");

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

	// -------------------------------------------------/
	public String choixType() {
		switch (this) {
		case DVD:
			return typeDoc = "DVD";
		case Blu_Ray:
			return typeDoc = "Blu_Ray";
		case Blu_Ray_3D:
			return typeDoc = "Blu Ray 3D";
		case Periodique:
			return typeDoc = "Periodique";
		case Livre:
			return typeDoc = "Livre";
		}
		return typeDoc;
	}

}
