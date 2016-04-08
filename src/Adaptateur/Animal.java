package Adaptateur;

import classes.Fusee;

public class Animal implements AstronauteDeguise
{
    // instance variables - replace the example below with your own
    private String espece;
    private boolean capture;
    private Chasseur chasseur;
    private Fusee fusee;


    public Animal()
    {
        this.espece = "";
        this.capture = false;        
    }

    public boolean capturer(Chasseur c)
    {
        this.setChasseur(c);
        this.setCapture();
        
        return this.getCapture();
    }
    
    public String getEspece()
    {
        return this.espece;
    }
    
    public void setEspece(String e)
    {
        this.espece = e;
    }
    
    public void setCapture()
    {
        this.capture = true;
    }
    
    public boolean getCapture()
    {
        return this.capture;
    }
    
    public void setChasseur(Chasseur c)
    {
    	this.chasseur=c;
    }
    
    public Chasseur getChasseur()
    {
    	return this.chasseur;
    }

	public int chargerLaFuseeAnimal(int poids){
		// On charge de la paille si le poids est positif
    	if(poids >= 0){
            fusee.chargerFusee(poids);
            System.out.println("Votre fusée est a nouveau chargée avec de la paille");
    	}else{
    		System.out.println("Votre fusée n'a pas été chargée à cause du poids inférieur à 0");
    	}
    	
    	return this.fusee.getPoids();
	};;
	
	public int chargerLaFuseeAstronaute(int poids){
		System.out.println("Tu n'es pas un astronaute, tu ne peux pas charger d'équipement High-Tech !!! ");
		return -1;
	};
	
	public int chargerLaFuseeChasseur(int poids){
		System.out.println("Tu n'es pas un chasseur, tu ne peux pas charger de fusils !!! ");
		return -1;
	};


	public void afficherNomAstronaute() {
		// TODO Auto-generated method stub
		System.out.println("Je suis : "+espece);
		
	}
	
	public Fusee getFusee() {
		return fusee;
	}

	public void setFusee(Fusee fusee) {
		this.fusee = fusee;
	}
}
