
public abstract class Employe {
protected String matricule;
protected  String nom;
protected Double TarifJournalier;
public Employe(String matricule, String nom, Double tarifJournalier) {
	this.matricule = matricule;
	this.nom = nom;
	this.TarifJournalier = tarifJournalier;
	
}
public String getMatricule() {
	return matricule;
}

public abstract double calculerCout(int nbJours);

public void afficherDetails() {
    System.out.println("matricule : " +matricule);
    System.out.println("nom: " +nom);
    System.out.println("Tarifjournalier : " + TarifJournalier + " DH");
}
}


