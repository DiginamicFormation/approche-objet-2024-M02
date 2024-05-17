package annotations;
public class TestAnnotationToString {

	public static void main(String[] args) {
		Pays usa = new Pays("USA", 350, 52000);
		System.out.println(usa);

		Pays france = new Pays("france", 66, 43000);
		System.out.println(france);
	}

}