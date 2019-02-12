package fr.nlco.tuto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestTemps {
    private Temps refTemps;

    @Given("^un temps (\\d+) heures (\\d+) minutes et (\\d+) secondes$")
    public void unTempsHeuresMinutesEtSecondes(Integer arg0, Integer arg1, Integer arg2) {
        System.out.println("arguments: " + arg0 + ", " + arg1 + ", " + arg2 + "\n");
        this.refTemps = new Temps(arg0,arg1,arg2);
    }

    @When("^ajout (\\d+) heure$")
    public void ajoutNbHeureHeure(int nbHeure) {
        refTemps.ajouterHeures(nbHeure);
    }

    @Then("^la valeur de temps est (\\d+) heures (\\d+) minutes (\\d+) secondes$")
    public void la_valeur_de_temps_est_heures_minutes_secondes(int newHeure, int newMinute, int newSeconde) throws Throwable {
        System.out.println(refTemps.getHeures()+ " h " + refTemps.getMinutes() + " m " + refTemps.getSecondes() + "s");
        Assert.assertTrue("Heure correctement incrémentée", refTemps.getHeures()==newHeure);
        Assert.assertTrue("Minute correctement incrémentée", refTemps.getMinutes()==newMinute);
        Assert.assertTrue("Seconde correctement incrémentée" + refTemps.getSecondes(), refTemps.getSecondes()==newSeconde);
    }


    @When("^ajout (\\d+) minutes$")
    public void ajoutNbMinutesMinutes(int nbMinutes) {
        refTemps.ajouterMinutes(nbMinutes);
    }

    @When("^ajout (\\d+) secondes$")
    public void ajoutNbSecondeSecondes(int nbSeconde) {
        refTemps.ajouterSecondes(nbSeconde);
    }


}
