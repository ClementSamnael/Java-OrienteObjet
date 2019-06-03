package exemple;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
//		Personne p3 = new Personne("Robin");

		p2.setName("Jean Baptiste");
		System.out.println(p1.nbInstance);
		System.out.println(p2.nbInstance);
		System.out.println(Personne.nbInstance);
	}

}
