package fichiers;

import java.util.Comparator;

public class VilleComparateur implements Comparator<Ville> {
	
	public static final int TRI_NOM_ASC = 0;
	public static final int TRI_NOM_DESC = 1;
	public static final int TRI_POP_ASC = 2;
	public static final int TRI_POP_DESC = 3;
	
	private int typeTri;
	
	public VilleComparateur() {
		this(TRI_POP_ASC);
	}
	
	public VilleComparateur(int typeTri) {
		this.typeTri = typeTri;
	}

	@Override
	public int compare(Ville o1, Ville o2) {
		return switch (typeTri) {
			case TRI_NOM_ASC -> o1.getNom().compareTo(o2.getNom());
			case TRI_NOM_DESC -> -o1.getNom().compareTo(o2.getNom());
			case TRI_POP_ASC -> o1.getPop()-o2.getPop();
			case TRI_POP_DESC -> o2.getPop()-o1.getPop();
			default -> o1.getPop()-o2.getPop();
		};
	}

}
