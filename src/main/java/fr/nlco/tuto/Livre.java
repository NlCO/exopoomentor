package fr.nlco.tuto;

public class Livre {
    private String titre;
    private String auteur;
    private int annee;
    private float prix;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Livre() {
    }

    public Livre(String titre) {
        this.titre = titre;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Livre(String titre, String auteur, float prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public Livre(String titre, String auteur, float prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.prix = prix;
    }

    public Livre(Livre ref) {
        this.titre = ref.getTitre();
        this.auteur = ref.getAuteur();
        this.annee = ref.getAnnee();
        this.prix = ref.getPrix();

    }

    @Override
    public String toString() {
        return "Le livre " + titre + " écrit par " + auteur + " en " + annee + " coute " + prix + "€";
    }
}
