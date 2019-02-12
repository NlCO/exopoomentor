package fr.nlco.tuto;

public class Personne {
    private String nom;
    private String prenom;
    private Integer age;
    private Sexe sexe;

    public enum Sexe {
        M("Masculin", "Mr"), F("Féminin", "Mme");

        private String genre = "";
        private String titre = "";

        Sexe(String genre, String titre) {
            this.genre = genre;
            this.titre = titre;
        }

        @Override
        public String toString() {
            return genre;
        }
    }

    public Personne(String nom, String prenom, int age, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = this.checkAge(age);
        this.sexe = sexe;
    }

    public Personne(String nom, String prenom) {
        this(nom,prenom,0,null);
    }

    public Personne(String nom, String prenom, int age) {
        this(nom,prenom,age,null);
    }

    public Personne(Personne clone) {
        this(clone.getNom(),clone.getPrenom(),clone.getAge(),clone.getSexe());
    }

    public Personne() {
        this("A", "Nonyme", 0, Sexe.M);
    }

    private int checkAge(int age) {
        return (age >= 0 && age <= 130) ?  age : 0;
    }

    @Override
    public String toString() {
        return "Personne : " + sexe.titre + " " + nom + " " + prenom + " (" + age + " ans)";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = this.checkAge(age);
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }
}
