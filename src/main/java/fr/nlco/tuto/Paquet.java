package fr.nlco.tuto;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Paquet {
    private List<Carte> deck;

    public Paquet() {
        deck = new LinkedList<>();
        for (Carte.Couleur couleur : Carte.Couleur.values()) {
            for (Carte.Rang rang: Carte.Rang.values()) {
                Carte carte = new Carte(rang,couleur);
                //System.out.println(carte);
                deck.add(carte);
            }
        }
        this.melanger();
        //for (Carte carte : deck) {System.out.println(carte);}
    }

    public int getNombreDeCartes() {
        return deck.size();
    }

    public void melanger() {
        Collections.shuffle(deck);
        //for (Carte carte : deck) {System.out.println(carte);}
    }

    public List<Carte> piocher(int n) {
        List<Carte> pioche = new LinkedList<>();
        if (n <= deck.size()) {
            for (int i=0; i < n; i++) {
                //System.out.println(deck.get(0));
                pioche.add(deck.get(0));
                deck.remove(0);
            }
            System.out.println(n + " cartes piochées");
        } else {
            System.out.println("Pas assez de cartes");
        }
        System.out.println("Il reste " + deck.size() + " cartes");
        return pioche;
    }

}
