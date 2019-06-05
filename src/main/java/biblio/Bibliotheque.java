package biblio;

import java.util.ArrayList;

public final class Bibliotheque {

	private ArrayList<Document> doc;

	// -------------------------------------------------/
	/*
	 * Constructeur
	 */
//	public Bibliotheque(ArrayList<Document> document) {
//		this.document = new ArrayList<Document>(document);
//	}
	/*
	 * Getter
	 */
	// -------------------------------------------------/

//	public ArrayList<Document> getDocument() {
//		return document;
//	}

	// -------------------------------------------------/
	/*
	 * Setter
	 */
//	public void setDocument(ArrayList<Document> document) {
//		this.document = document;
//	}

	// ---------------MÉTHODES----------------------------------/
	/*
	 * Ajout de document
	 */
//	public void ajoutDoc(Document doc) {
//		this.document.add(doc);
//	}

	// ----------------CORRECTIONS---------------------------------/
	// Correction
	// private Document[] document;

	// ----------------Constructeur---------------------------------/
	public Bibliotheque(ArrayList<Document> doc) {
		this.doc = doc;
	}

//	public void ajoutDoc(Document doc) {
//		for (int i = 0; i < doc.length; i++) {
//
//			if (doc[i] == null) {
//				doc[i] = doc;
//				break;
//			}
//		}
//	}
//
//	public int getNbDVD() {
//		int sum = 0;
//		for (int i = 0; i < doc.length; i++) {
//			if (doc[i] != null && doc[i] instanceof Video) {
//				if (((Video) doc[i]).getTypeDocument().equals("DVD")) {
//					sum++;
//				}
//			}
//		}
//		return sum;
//	}
	public int getnbDVD() {
		int nbDVD = 0;
		for (int i = 0; i < doc.size(); i++) {
			if (doc.get(i).getTypeDoc().equals("DVD")) {
				nbDVD++;
			}
		}
		return nbDVD;
	}

}
