package fr.nlco.tuto;

public class Carte {
    private Rang rang;
    private Couleur couleur;

    public enum Rang {
        AS, ROI, DAME, VALET, DIX, NEUF, HUIT, SEPT, SIX, CINQ, QUATRE, TROIS, DEUX
    }

    public enum Couleur {
        PIQUE, COEUR, CARREAU, TREFLE
    }

    public Carte(Rang rang, Couleur couleur) {
        this.rang = rang;
        this.couleur = couleur;
    }

    public Rang getRang() {
        return rang;
    }

    public void setRang(Rang rang) {
        this.rang = rang;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return rang + " de " + couleur;
    }
}
