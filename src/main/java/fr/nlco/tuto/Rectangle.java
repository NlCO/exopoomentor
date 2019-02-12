package fr.nlco.tuto;

import sun.security.util.PendingException;

public class Rectangle {
    private float longueur;
    private float largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = this.checkPositive(longueur);
        this.largeur = this.checkPositive(largeur);
    }

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(Rectangle modele) {
        this(modele.getLongueur(), modele.getLargeur());
    }

    private float checkPositive(float value) {
        if (value >= 0) {
            return value;
        } else {
            throw new PendingException();
        }
    }

    public float perimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = this.checkPositive(longueur);
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = this.checkPositive(largeur);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }

    public float aire() {
        return longueur * largeur;
    }

    public boolean isCarre() {
        return (longueur == largeur) /* ? true : false */;
    }
}
