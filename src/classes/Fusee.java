package classes;

import java.util.ArrayList;

import Adaptateur.AstronauteAdaptateur;
import Adaptateur.AstronauteDeguise;
import Adaptateur.AstronauteItf;

public class Fusee implements AstronauteItf
{
    // instance variables - replace the example below with your own
    private int x;
    private String nom;
    private int poids;
    private AstronauteAdaptateur astronaute;

    /**
     * Constructor for objects of class Fusee
     */
    public Fusee()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPoids(int p){
        this.poids = p;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getPoids(){
        return this.poids;
    }
    
    public void chargerFusee(int charge){

    	if(charge >= 0){
            this.poids+=charge;
            System.out.println("Chargement de "+this.nom+" reussi, nouveau poids :"+this.poids);
            
    	}else {
    		System.out.println("Pas de changement de poids car le poids est negatif.");
    	}
    	
    	//return this.poids;
    }
    
    
    public void setAstronaute(AstronauteAdaptateur astro){
        this.astronaute = astro;
    }

    
    
}
