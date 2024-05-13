package fichiers.comptage;

import java.util.ArrayList;
import java.util.List;

public class Compteur {

	private String nom;
	private int valeur;
	private List<Compteur> compteurs = new ArrayList<>();
	public Compteur(String nom) {
		super();
		this.nom = nom;
	}
	
	public Compteur getCompteur(String nom) {
		for (Compteur cpt: compteurs) {
			if (cpt.getNom().equalsIgnoreCase(nom)) {
				return cpt;
			}
		}
		Compteur cpt = new Compteur(nom);
		compteurs.add(cpt);
		return cpt;
	}
	
	public void inc(String nom) {
		Compteur cpt = getCompteur(nom);
		cpt.valeur++;
	}
	
	public int getTotal() {
		int total = valeur;
		for (Compteur cpt: compteurs) {
			total+=cpt.getValeur();
		}
		return total;
	}
	
	public String affichage() {
		return affichage(0);
	}
	
	public String affichage(int niveau) {
		niveau++;
		String chaine = nom+" - "+getTotal()+"\n";
		for (Compteur cpt: compteurs) {
			chaine+="\t".repeat(niveau)+cpt.affichage(niveau);
		}
		return chaine;
	}
	
	public int getValeur() {
		return valeur;
	}
	public String getNom() {
		return nom;
	}
	public List<Compteur> getCompteurs() {
		return compteurs;
	}
}
