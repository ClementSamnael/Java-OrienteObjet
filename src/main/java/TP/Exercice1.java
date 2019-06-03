//Saisir un nombre n et afficher les n nombres premiers
package TP;
import java.util.Random;

public class Exercice1 {

	public static int generateRandom(int min, int max){
		Random rand = new Random();
		return rand.nextInt(max - min +1) + min;
	}
	
	public static boolean isPremier(int premier) {
		int div = 2;
		boolean test = true;
		if(premier <= 1) {
			return false;
		}
		while((test) && (div<premier)) {
			if(premier%2==0) {
				return false;
			}
			div ++;
		}
		return true;
	}
	
	//Correction
	public static boolean isPrime(int number) {
		if(number<=1) {
			return false;
		}
		for(int i = 2; i<number/2;i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		//System.out.println(generateRandom(0,50));
		System.out.println(isPrime(5));
		System.out.println(isPremier(5));

	}

}
