package fr.nlco.tuto;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PaquetTest {

    @Test
    public void getNombreDeCartes() {
        //arrange
        Paquet deck1 = new Paquet();

        //act
        int nbCarte = deck1.getNombreDeCartes();

        //assert
        Assert.assertEquals(52,nbCarte);

    }

    @Test
    public void melanger() {
        //arrange
        Paquet deck2 = new Paquet();

        //act
        deck2.melanger();

        //assert
        Assert.assertEquals(52,deck2.getNombreDeCartes());
    }

    @Test
    public void piocher() {
        //arrange
        Paquet deck3 = new Paquet();

        //act
        List<Carte> hand = deck3.piocher(3);

        //assert
        Assert.assertEquals(49,deck3.getNombreDeCartes());
        Assert.assertEquals(3, hand.size());
    }

    @Test
    public void piocher2() {
        //arrange
        Paquet deck3 = new Paquet();

        //act
        List<Carte> hand2 = deck3.piocher(53);

        //assert
        Assert.assertEquals(52,deck3.getNombreDeCartes());
        Assert.assertEquals(0, hand2.size());

    }

    @Test
    public void piocher3() {
        //arrange
        Paquet deck3 = new Paquet();

        //act
        List<Carte> hand3 = deck3.piocher(52);

        //assert
        Assert.assertEquals(0,deck3.getNombreDeCartes());
        Assert.assertEquals(52, hand3.size());
    }

}