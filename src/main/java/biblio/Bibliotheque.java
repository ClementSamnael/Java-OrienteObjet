package biblio;

import java.util.ArrayList;

public final class Bibliotheque {

	private ArrayList<Document> doc;

	// -------------------------------------------------/

	// ----------------Constructeur---------------------------------/
	public Bibliotheque() {
		this.doc = doc;
	}

	// ----------------Getter---------------------------------/

	public ArrayList<Document> getDocument() {
		return doc;
	}

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

	public void ajoutDoc(Document documents) {
		doc.add(documents);
	}

	public int getnbDVD() {
		int nbDVD = 0;
		Type dvd = null;
		for (int i = 0; i < doc.size(); i++) {
			if (doc.get(i).equals((dvd.getTypeDoc()))) {
				nbDVD++;
			}
		}
		return nbDVD;
	}

}
