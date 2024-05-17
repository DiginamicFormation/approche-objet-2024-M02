package utils;

public class TestStringUtils {

	public static void main(String[] args) {
		
		String nom = "Durand";
		int age = 546;
		
		String chaine = null;
		try {
			chaine = StringUtils.toString(" ");
		}
		catch (ConcatenationException e) {
			e.printStackTrace();
		}
		System.out.println(chaine);
	}

}
