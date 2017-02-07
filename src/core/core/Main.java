package core;

import entities.Droits;
import entities.User;

public class Main {
		
	public static void main(String[] args) {
		User user1 = new User("Dereck","Daniel","ddaniel","BonJoir");
		User user2 = new User("Wylliam","Delaunay","wdelaun","BonDour");
		
		Droits droit1 = new Droits();
		droit1.setNiveau("1");
		droit1.setNom("homme");
		droit1.setSeverite("Fort");
		droit1.setSociete("DDCorp");
		
		Droits droit2 = new Droits();
		droit2.setNiveau("4");
		droit2.setNom("citoyen");
		droit2.setSeverite("Faible");
		droit2.setSociete("WDCorp");	
		}
}
