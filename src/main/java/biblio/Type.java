package biblio;

public enum Type {
	DVD("DVD"), Blu_Ray("Blu Ray"), Blu_Ray_3D("Blu Ray 3D");

	private String typeDoc;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	private Type(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	// -------------------GETTER------------------------------/

	public String getTypeDoc() {
		return typeDoc;
	}

	// -------------------------------------------------/
	@Override
	public String toString() {
		return ("Le type de Vidéo choisi : " + typeDoc);
	}

}
