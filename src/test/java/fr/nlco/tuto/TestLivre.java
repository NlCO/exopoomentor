package fr.nlco.tuto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class TestLivre {
    private String titre;
    private String auteur;
    private int annee;
    private float prix;
    private Livre livre;
    private Livre ref;

    @Given("^aucun parametre$")
    public void aucunParametre() {
        //System.out.println("aucun param");
    }

    @When("^je crée une instance de Livre$")
    public void jeCréeUneInstanceDeLivre() {
        this.livre = new Livre();
    }

    @Then("^affiche Le livre \"([^\"]*)\" écrit par \"([^\"]*)\" en (\\d+) coute \"([^\"]*)\"$")
    public void afficheLeLivreÉcritParEnCoute(String titre, String auteur, int annee, String prix) {
        String resultExpected = "Le livre " + titre + " écrit par " + auteur + " en " + annee + " coute " + prix + "€";
        assertEquals(resultExpected, livre.toString());
    }

    @Given("^le titre du livre est \"([^\"]*)\"$")
    public void leTitreDuLivreEst(String arg0) throws Throwable {
        this.titre = arg0;
    }

    @When("^je crée une instance de Livre avec son titre$")
    public void jeCréeUneInstanceDeLivreAvecSonTitre() {
        this.livre = new Livre(titre);
    }


    @Given("^le titre du livre est \"([^\"]*)\" et l'auteur \"([^\"]*)\"$")
    public void leTitreDuLivreEstEtLAuteur(String arg0, String arg1) throws Throwable {
        this.titre = arg0;
        this.auteur = arg1;
    }

    @When("^je crée une instance de Livre avec son titre et son auteur$")
    public void jeCréeUneInstanceDeLivreAvecSonTitreEtSonAuteur() {
        this.livre = new Livre(titre, auteur);
    }


    @Given("^le titre du livre est \"([^\"]*)\" et l'auteur \"([^\"]*)\" pour \"([^\"]*)\"$")
    public void leTitreDuLivreEstEtLAuteurPour(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.titre = arg0;
        this.auteur = arg1;
        this.prix = Float.parseFloat(arg2);
    }

    @When("^je crée une instance de Livre avec son titre et son auteur et sont prix$")
    public void jeCréeUneInstanceDeLivreAvecSonTitreEtSonAuteurEtSontPrix() {
        this.livre = new Livre(titre,auteur,prix);
    }

    @Given("^le titre du livre est \"([^\"]*)\" et l'auteur \"([^\"]*)\" pour \"([^\"]*)\" en (\\d+)$")
    public void leTitreDuLivreEstEtLAuteurPourEn(String arg0, String arg1, String arg2, int arg3) throws Throwable {
        this.titre = arg0;
        this.auteur = arg1;
        this.prix = Float.parseFloat(arg2);
        this.annee =  arg3;
    }

    @When("^je crée une instance de Livre avec son titre et son auteur son prix et son annee$")
    public void jeCréeUneInstanceDeLivreAvecSonTitreEtSonAuteurSonPrixEtSonAnnee() {
        this.livre = new Livre(titre,auteur,prix,annee);
    }

    @Given("^la référence est le livre \"([^\"]*)\" de \"([^\"]*)\" pour \"([^\"]*)\" en (\\d+)$")
    public void laRéférenceEstLeLivreDePourEn(String arg0, String arg1, String arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.ref = new Livre(arg0,arg1,Float.parseFloat(arg2),arg3);
    }

    @When("^je crée une instance de Livre avec une autre instance$")
    public void jeCréeUneInstanceDeLivreAvecUneAutreInstance() {
        this.livre = new Livre(ref);
    }

}
