public class Commercial extends Employe{
	Double tauxPrime;

	public Commerciel(String matricule, String nom, Double tarifJournalier,Double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime=tauxPrime;
	}
	public double calculerCout(int nbJours) {
       
            
       
    }
	public void afficherDetails() {
        super.afficherDetails();
        System.out.println("tauxPrime : " + tauxPrime);
    }
}