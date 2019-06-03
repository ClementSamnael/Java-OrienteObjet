package Dechet;

public class JeuDeCarte {

	private int valeurs[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private String couleurs[] = { "Pique", "Coeur", "Trefle", "Carreau" };
	private int paquet[] = new int[52];

	/*
	 * Constructeur
	 */
	public JeuDeCarte() {
	}

	/*
	 * Getter
	 */
	public String[] getCouleurs() {
		return couleurs;
	}

	public int[] getValeurs() {
		return valeurs;
	}

	public int[] getPaquet() {
		return paquet;
	}

	/*
	 * Setter
	 */
	public void setValeurs(int[] valeurs) {
		this.valeurs = valeurs;
	}

	public void setCouleurs(String[] couleurs) {
		this.couleurs = couleurs;
	}

	public void setPaquet(int[] paquet) {
		this.paquet = paquet;
	}

	public static void battre(int[] donne) {
		int n = donne.length;
		int j, tmp;
		for (int i = n - 1; i > 0; i--) {
			j = (int) (Math.random() * (i + 1));
			tmp = donne[i];
			donne[i] = donne[j];
			donne[j] = tmp;
		}
	}

	public static int[] jeu(int n) {
		int[] jeu = new int[n];
		for (int i = 0; i < n; i++) {
			jeu[i] = i + 1;
			battre(jeu);
		}
		return jeu;
	}
}
