


public class Ingenieur extends Employe {
	private int niveauExpertise;

	public Ingenieur(String matricule, String nom, Double tarifJournalier,int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
	    this.niveauExpertise=niveauExpertise;
	}
	
	 public double calculerCout(int nbJours) {
	        if (niveauExpertise<3) {
	            return TarifJournalier * nbJours;
	        } else {
	            return (TarifJournalier * nbJours) + (100 * nbJours);
	        }
	    }
	 public int getniveauEpertise() {
	        return niveauExpertise;
	    }

	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("niveauEpertise : " + niveauExpertise);
	    }
	}




