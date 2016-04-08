package Adaptateur;

import classes.Fusee;


public class Astronaute implements AstronauteDeguise
{
    // instance variables - replace the example below with your own
    private int x;
    private String nom;
    private Fusee fu;


    public Astronaute()
    {
    }

    /*
    public int  chargerFuseeAstronaute(int p){
    	if(p >= 0){
            fu.chargerFusee(p);
            System.out.println("Votre fus�e est a nouveau charg�e");
    	}else{
    		System.out.println("Votre fus�e n'a pas �t� charg� � cause du poids inf�rieur � 0");
    	}
    	
    	return fu.getPoids();
    }*/
    
    public void setFusee(Fusee f){
        this.fu = f;
    }
    
    public Fusee getFusee(){
        return fu;
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int chargerLaFuseeAnimal(int poids){
		System.out.println("Tu n'es pas un animal, tu ne peux pas charger de paille !!! ");
		return -1;
	};
	
	public int chargerLaFuseeAstronaute(int poids){
		// On charge de l'�quipement High-Tech si le poids est positif
    	if(poids >= 0){
            this.fu.chargerFusee(poids);
            System.out.println("Votre fus�e est a nouveau charg�e avec de l'�quipement High-Tech");
    	}else{
    		System.out.println("Votre fus�e n'a pas �t� charg�e à cause du poids inf�rieur à 0");
    	}
    	
    	return this.fu.getPoids();
	
	};
	
	public int chargerLaFuseeChasseur(int poids){
		System.out.println("Tu n'es pas un chasseur, tu ne peux pas charger de fusils !!! ");
		return -1;
	};

	public void afficherNomAstronaute() {
		// TODO Auto-generated method stub
		System.out.println("Je suis :"+this.nom);
		
	}
    
    
}
