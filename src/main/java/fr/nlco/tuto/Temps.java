package fr.nlco.tuto;

public class Temps {

    private int heures;
    private int minutes;
    private int secondes;

    public Temps(int heures, int minutes, int secondes) {
        this.heures = this.checkHeure(heures);
        this.minutes = this.checkMinuteOrSeconde(minutes);
        this.secondes = this.checkMinuteOrSeconde(secondes);
    }

    public Temps() {
        this(0, 0, 0);
    }

    public Temps(int heures) {
        this(heures, 0, 0);
    }

    public Temps(int heures, int minutes) {
        this(heures, minutes, 0);
    }

    public Temps(Temps timestamp) {
        this(timestamp.getHeures(), timestamp.getMinutes(), timestamp.getSecondes());
    }

    private int checkHeure(int value) {
        if (value < 0 || value > 23) {
            System.out.println("la valeur d'un heure doit être comprise entre 0 et 23 inclus");
            throw new RuntimeException();
        } else {
            return value;
        }
    }

    private int checkMinuteOrSeconde(int value) {
        if (value < 0 || value > 60) {
            System.out.println("les valeurs de minutes ou seconde doivent être comprise entre 0 et 59 inclus");
            throw new RuntimeException();
        } else {
            return value;
        }
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterHeures(int nbHeures) {
        int nouvelleHeure = (this.getHeures() + nbHeures) % 24;
        this.setHeures(this.checkHeure(nouvelleHeure));
    }

    public void ajouterMinutes(int nbMinutes) {
        int totalMinutes = this.getMinutes() + nbMinutes;
        int nouvelleMinutes = totalMinutes % 60;
        if ((totalMinutes / 60) > 0) {
            this.ajouterHeures((totalMinutes / 60));
        }
        this.setMinutes(this.checkMinuteOrSeconde(nouvelleMinutes));
    }

    @Override
    public String toString() {
        return "Temps{" + "heures=" + heures + ", minutes=" + minutes + ", secondes=" + secondes + '}';
    }

    public void ajouterSecondes(int nbSeconde) {
        int totalSecondes = this.getSecondes() + nbSeconde;
        int nouvelleSeconde = totalSecondes % 60;
        if ((totalSecondes /60) > 0) {
            this.ajouterMinutes((totalSecondes / 60));
        }
        this.setSecondes(this.checkMinuteOrSeconde(nouvelleSeconde));
    }
}
