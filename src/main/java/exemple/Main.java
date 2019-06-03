package exemple;

public class Main {

	public static void main(String[] args) {
		Personne p1 = new Personne("Mattieu");
		Personne p2 = new Personne("Mathilde");
		Personne p3 = new Personne("Robin");

		p2.setName("Jean Baptiste");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
	}

}
