package equals;

public class TestEqualsInt {

	public static void main(String[] args) {
		
		Integer a = 128; 
		Integer b = 128;

		// Attention le == ne fonctionne qu'entre -128 et 127 
		if (a == b) {
			System.out.println("les entiers sont identiques");
		}
		else {
			System.out.println("les entiers sont différents");
		}
		
		// On utilise la méthode equals pour les wrappers
		if (a.equals(b)) {
			System.out.println("les entiers sont identiques");
		}
		else {
			System.out.println("les entiers sont différents");
		}
	}

}
