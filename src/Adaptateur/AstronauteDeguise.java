package Adaptateur;

import classes.Fusee;

public interface AstronauteDeguise {
	
	public int chargerLaFuseeAnimal(int poids);
	public int chargerLaFuseeAstronaute(int poids);
	public int chargerLaFuseeChasseur(int poids);
	
	public void setFusee(Fusee f);
	public Fusee getFusee();
}
