package Adaptateur;



import java.util.ArrayList;

import classes.Fusee;

public class Chasseur implements AstronauteDeguise
{
    // instance variables - replace the example below with your own
    private String nom;
    private Fusee fusee;
	private ArrayList<Animal> animals;
    
    /**
     * Constructor for objects of class Chasseur
     */
    public Chasseur()
    {
        this.nom = "";
        animals = new ArrayList<Animal>();
    }

   public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String n)
    {
        this.nom = n;
    }
    
    public Animal getLastAnimal()
    {
        return animals.get(animals.size()-1);
    }

    
    public String capturerAnimal(Animal a){
        animals.add(a);
        a.setChasseur(this);
        
        return animals.get(animals.size()-1).getEspece();
    }
    
	public int chargerLaFuseeAnimal(int poids){
		System.out.println("Tu n'es pas un animal, tu ne peux pas monter !!! ");
		return -1;
	};;
	
	public int chargerLaFuseeAstronaute(int poids){
		System.out.println("Tu n'es pas un astronaute, tu ne peux pas monter !!! ");
		return -1;
	};
	
	public int chargerLaFuseeChasseur(int poids){
		// On charge de la paille si le poids est positif
    	if(poids >= 0){
    		fusee.chargerFusee(poids);
            System.out.println("Votre fusée est à nouveau chargée avec des fusils");
    	}else{
    		System.out.println("Votre fusée n'a pas été chargée à cause du poids inférieur à  0");
    	}
    	
    	return this.fusee.getPoids();
	};

	public void afficherNomAstronaute() {
		// TODO Auto-generated method stub
		System.out.println("Je suis :"+this.nom);
		
	}

	public Fusee getFusee() {
		return fusee;
	}

	public void setFusee(Fusee fusee) {
		this.fusee = fusee;
	}
    
	
	
}
