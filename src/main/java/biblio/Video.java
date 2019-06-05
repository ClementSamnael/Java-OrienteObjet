package biblio;

public final class Video extends Document {

	private Type typeDoc;

	// -----------------Constructeur--------------------------------/
	public Video(String titre, String auteur, Type typeDoc) {
		super(titre, auteur);
		this.typeDoc = typeDoc;
	}

	// ------------------@Override-------------------------------/
	@Override
	public boolean estEmpruntable() {
		return true;
	}

	@Override
	public float coutDocument() {
		return 70.0F;
	}

	public Type getTypeDocument() {
		return this.typeDoc;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + this.typeDoc;
	}
}
