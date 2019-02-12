package fr.nlco.tuto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestRectangle {
    private Rectangle rectangle;
    private float perimeter;
    private float aire;

    @Given("^un rectangle de longueur (\\d+\\.?\\d*) et de largeur (\\d+\\.?\\d*)$")
    public void unRectangleDeLongeurLEtDeLargeurL(float longueur, float largeur ) {
        this.rectangle = new Rectangle(longueur, largeur);
    }

    @When("^je calcule le prérimtre$")
    public void jeCalculeLePrérimtre() {
        this.perimeter = rectangle.perimetre();
    }

    @Then("^Le périmetre est de (\\d+\\.?\\d*)$")
    public void lePérimtreEstDeP(float P) {
        Assert.assertTrue("attendu : P - calculé : "+ this.perimeter,P==this.perimeter);
    }

    @When("^je calcule la surface$")
    public void jeCalculeLaSurface() {
        aire = rectangle.aire();
    }

    @Then("^La surface est de (\\d+\\.?\\d*)$")
    public void laSurfaceEstDeS(float aire) {
        Assert.assertTrue("Attendu : "+ aire + " - Calculé : " + this.aire ,aire==this.aire);
    }

    @When("^je vérifie sir le rectangle est carré$")
    public void jeVérifieSirLeRectangleEstCarré() {
    }

    @Then("^Le rectangle est carré : (.*)$")
    public void leRectangleEstCarréBooleanSquare(boolean isSquare) {
        Assert.assertTrue("Attendu : "+ isSquare + " - Calculé : " + rectangle.isCarre(),isSquare==rectangle.isCarre());
    }
}
