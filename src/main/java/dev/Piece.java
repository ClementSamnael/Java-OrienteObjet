package dev;

public class Piece {
	/*
	 * Variables des pièces
	 */
	protected String couleur;
	protected Position position;

	/*
	 * Constructeur des pièces
	 */
	public Piece(String couleur, Position position) {
		super();
		this.couleur = couleur;
		this.position = position;
	}

	/*
	 * Getter
	 */
	public String getCouleur() {
		return couleur;
	}

	public Position getPosition() {
		return position;
	}

	/*
	 * Setter
	 */

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean positionPossible(Position position) {
		return false;

	}

}
