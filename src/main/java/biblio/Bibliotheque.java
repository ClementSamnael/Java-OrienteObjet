package biblio;

import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Document> document;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
	public Bibliotheque(ArrayList<Document> document) {
		this.document = new ArrayList<Document>(document);
	}
	/*
	 * Getter
	 */
	// -------------------------------------------------/

	public ArrayList<Document> getDocument() {
		return document;
	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
	public void setDocument(ArrayList<Document> document) {
		this.document = document;
	}

	// ---------------MÉTHODES----------------------------------/
	/*
	 * Ajout de document
	 */
	public void ajoutDoc(Document doc) {
		this.document.add(doc);
	}

	public int nbDVD() {
		int nbDVD = 0;
		for (int i = 0; i < document.size(); i++) {
			if (document.get(i).getTypeDocument().equals("DVD")) {
				nbDVD++;
			}
		}
		return nbDVD;
	}
}
