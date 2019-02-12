package fr.nlco.tuto;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonneTest {


    @Test
    public void test1() {
        //arrange
        Personne personne = new Personne();

        //act
        personne.toString();

        //assert
        System.out.println(personne);

    }


    @Test
    public void test2() {
        //arrange
        Personne personne2 = new Personne(new Personne());

        //act
        personne2.setAge(135);

        //assert
        System.out.println(personne2);

    }

    @Test
    public void test3() {
        //arrange
        Personne personne = new Personne(new Personne());

        //act
        personne.setAge(35);
        personne.setSexe(Personne.Sexe.F);

        //assert
        System.out.println(personne);

    }

}