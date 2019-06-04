package dev;

import java.util.ArrayList;

public class Echiquier extends Piece {
	/*
	 * L'échiquier possède une collection de pièces et plusieurs méthodes
	 */

	/*
	 * Variables
	 */
	protected ArrayList<Piece> piece;

	/*
	 * Consturcteur de l'échiquier
	 */
	public Echiquier(String couleur, Position position, ArrayList<Piece> piece) {
		super(couleur, position);
		this.piece = piece;
	}

	/*
	 * Getter
	 */
	public ArrayList<Piece> getPiece() {
		return piece;
	}

	/*
	 * Setter
	 */
	public void setPiece(ArrayList<Piece> piece) {
		this.piece = piece;
	}

	/*
	 * Ajouter une piece
	 * 
	 * @param : Piece p
	 */
	public void ajouterPiece(Piece p) {
		p = new Piece(super.couleur, super.position);
	}

	public Piece getPiece(Position position) {
		return null;
	}

}
