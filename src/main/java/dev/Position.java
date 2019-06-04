package dev;

public class Position {

	/*
	 * Variables des positions des pièces sur l'échiquier
	 */

	int posx, posy;

	/*
	 * Constructeur
	 */
	public Position(int posx, int posy) {
		this.posx = posx;
		this.posy = posy;
	}

	/*
	 * Getter
	 */
	public int getPosx() {
		return posx;
	}

	public int getPosy() {
		return posy;
	}

	/*
	 * Setter
	 */
	public void setPosx(int posx) {
		this.posx = posx;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

}
