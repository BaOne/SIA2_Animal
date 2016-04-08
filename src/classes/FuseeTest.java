package classes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Adaptateur.Animal;
import Adaptateur.Astronaute;
import Adaptateur.AstronauteAdaptateur;
import Adaptateur.Chasseur;


public class FuseeTest
{
    /**
     * Default constructor for test class Fus�eTest
     */
    public FuseeTest()
    {
    }

    /*@Test
    public void TestChargerFusee()
    {
        Fusee fusee1 = new Fusee();
        fusee1.setNom("Ariane");
        fusee1.setPoids(40);
        
        
        assertEquals(80, fusee1.chargerFusee(40));
    }*/

    @Test
    public void TestAstronauteChargeFusee()
    { 
        Fusee fusee1 = new Fusee();
        AstronauteAdaptateur ap = new AstronauteAdaptateur("Astronaute");
        
        //Astronaute astronau1 = new Astronaute();
        //Cr�ation de la fus�e Apollo pesant 50kg
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        //Un astronaute du nom de Ford est associ� à la fus�e
        
        fusee1.setAstronaute(ap);
        ap.getAstronaute().setFusee(fusee1);
        
        //Cet astronaute charge la fus�e avec 50kg
        //La fonction doit retourner le nouveau poids de la fus�e : 100
        ap.chargerFusee(50);
        assertEquals(100, fusee1.getPoids());
        
        //Notre instance d'astronaute doit �tre un astronaute
        assertEquals(true, ap.getAstronaute() instanceof Astronaute);
        //Pas un animal
        assertEquals(false, ap.getAstronaute() instanceof Animal);
        //Pas un chasseur
        assertEquals(false, ap.getAstronaute() instanceof Chasseur);
    }
    
    @Test
    public void TestAnimalChargeFusee()
    { 
        Fusee fusee1 = new Fusee();
        AstronauteAdaptateur ap = new AstronauteAdaptateur("Animal");
        
        //Astronaute astronau1 = new Astronaute();
        //Cr�ation de la fus�e Apollo pesant 50kg
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        //Un astronaute du nom de Ford est associ� à la fus�e
        
        fusee1.setAstronaute(ap);
        ap.getAstronaute().setFusee(fusee1);
        
        //Cet astronaute charge la fus�e avec 10kg
        //La fonction doit retourner le nouveau poids de la fus�e : 60
        ap.chargerFusee(10);
        assertEquals(60, fusee1.getPoids());
       
        //Pas un astronaute
        assertEquals(false, ap.getAstronaute() instanceof Astronaute);
        //Notre instance d'astronaute doit �tre un animal
        assertEquals(true, ap.getAstronaute() instanceof Animal);
        //Pas un chasseur
        assertEquals(false, ap.getAstronaute() instanceof Chasseur);
    }
    
    @Test
    public void TestChasseurChargeFusee()
    { 
        Fusee fusee1 = new Fusee();
        AstronauteAdaptateur ap = new AstronauteAdaptateur("Chasseur");
        
        //Astronaute astronau1 = new Astronaute();
        //Cr�ation de la fus�e Apollo pesant 50kg
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        //Un astronaute du nom de Ford est associ� à la fus�e
        
        fusee1.setAstronaute(ap);
        ap.getAstronaute().setFusee(fusee1);
        
        //Cet astronaute charge la fus�e avec 50kg
        //La fonction doit retourner le nouveau poids de la fus�e : 100
        ap.chargerFusee(50);
       
        //Pas un astronaute
        assertEquals(false, ap.getAstronaute() instanceof Astronaute);
        //Pas un animal
        assertEquals(false, ap.getAstronaute() instanceof Animal);
        //Notre instance d'astronaute doit �tre un chasseur
        assertEquals(true, ap.getAstronaute() instanceof Chasseur);
    }
    

    
    
    /*@Test
    public void TesterPoidsNegatifChargement(){
        Fusee fusee1 = new Fusee();
        fusee1.setNom("Ariane");
        fusee1.setPoids(40);
        
        
        assertEquals(40, fusee1.chargerFusee(-40));
    }
    
    @Test
    public void TesterPoidsNegatifAstronauteChargement(){
        Fusee fusee1 = new Fusee();
        Astronaute astronau1 = new Astronaute();
        
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        fusee1.setAstronaute(astronau1);
        
        astronau1.setNom("Ford");
        astronau1.setFusee(fusee1);
    
        assertEquals(50, astronau1.chargerLaFusee(fusee1, -50));
    }
    
    @Test
    public void TestAnimalChargerFusee()
    { 
        //Ici, on associe un animal à la fus�e pesant 50kg
    	Fusee fusee1 = new Fusee();
        Animal animal1 = new Animal();
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        fusee1.setAstronaute(animal1);
        animal1.setEspece("Cochon");
        //Cet animal doit pouvoir charger la fus�e avec 50kg
        //La fonction doit donc retourner 100kg
        assertEquals(100, animal1.chargerLaFusee(fusee1, 50));
    }
    
    @Test
    public void TestChasseurChargerFusee()
    { 
    	//Ici, on associe un animal à la fus�e pesant 50kg
    	Fusee fusee1 = new Fusee();
        Chasseur chass1 = new Chasseur();
        fusee1.setNom("Apollo");
        fusee1.setPoids(50);
        fusee1.setAstronaute(chass1);
        chass1.setNom("Tom");
        //Ce chasseur doit pouvoir charger la fus�e, toujours avec 50kg
        //La fonction doit donc retourner 100kg
        assertEquals(100, chass1.chargerLaFusee(fusee1, 50));
    }*/
    
}