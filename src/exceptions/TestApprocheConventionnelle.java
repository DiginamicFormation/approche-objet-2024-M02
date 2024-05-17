package exceptions;

public class TestApprocheConventionnelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = div(87, 0);
		System.out.println(result);
	}
	
	public static double div(double a, double b) {
		
		if (b==0) {
			//TODO jeter une exception
		}
		
		return a/b;
	}

}
