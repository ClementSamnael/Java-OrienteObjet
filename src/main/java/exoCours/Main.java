package exoCours;

public class Main {

	public static void main(String[] args) {

		Point p = new Point(0, 0);
		Point p2 = new Point(5, 9);
		Point p3 = new Point(10, -9);

		Cercle cercle = new Cercle(p, 5.3f);
		Rectangle rec = new Rectangle(p2, 2, 1);
		Carre carre = new Carre(p3, 1);

		System.out.println(cercle);
		System.out.println(rec);
		System.out.println(carre);
	}
}
