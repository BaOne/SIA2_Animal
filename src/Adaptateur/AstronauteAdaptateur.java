package Adaptateur;

import classes.Fusee;

public class AstronauteAdaptateur implements AstronauteItf{
	
	AstronauteDeguise astronaute;
	
	public AstronauteAdaptateur(String typeAstro){
		if(typeAstro.equals("Animal"))
		{
			astronaute = new Animal();
		}
		else if(typeAstro.equals("Astronaute"))
		{
			astronaute = new Astronaute();
		}
		else if (typeAstro.equals("Chasseur"))
		{
			astronaute = new Chasseur();
		}
	}
	
	public void chargerFusee(int poids){
		if(astronaute instanceof Animal)
		{
			astronaute.chargerLaFuseeAnimal(poids);
		}
		else if(astronaute instanceof Astronaute)
		{
			astronaute.chargerLaFuseeAstronaute(poids);
		}
		else if(astronaute instanceof Chasseur)
		{
			astronaute.chargerLaFuseeChasseur(poids);
		}
		//return astronaute.getFusee().getPoids();
	}
	
	public AstronauteDeguise getAstronaute()
	{
		return astronaute;
	}
	
}
