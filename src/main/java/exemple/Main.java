package exemple;

public class Main {

	public int division(int a, int b) throws Exception {
		int result = 0;
		try {
			result = a / b;
		} catch (Exception e) {
			throw new Exception("Impossible de diviser par zéro !!");
		}
		return result;
	}

	public static void main(String[] args) {

		Main main = new Main();
		try {
			System.out.println(main.division(5, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("YES");

//		try {
//			int nombre3 = nombre1 / nombre2;
//		} catch (ArithmeticException e) {
//			System.out.println("Error !");
//			System.out.println(e.getCause());
//		}
//		System.out.println("coucou");
//		Personne p1 = new Personne();
//		Personne p2 = new Personne();
//		Personne p3 = new Personne("Robin");
//
//		p2.setName("Jean Baptiste");
//		System.out.println(p1.nbInstance);
//		System.out.println(p2.nbInstance);
//		System.out.println(Personne.nbInstance);

//		Chien chien = new Chien("Toto");
//		chien.cri();
//		chien.test();
//
//		Chat chat = new Chat("Toto");
//		chat.cri();
//		chat.test();

//		Pays fr = Pays.FR;
//		Pays uk = Pays.UK;
//
//		System.out.println(fr.getNom());
//		System.out.println(uk.getCapital());

	}

}
