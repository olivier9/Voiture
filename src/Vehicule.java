public abstract class Vehicule {

    protected String marque;
    protected String modele;
    protected int vitesseMax;
    protected int vitesseCourante;
    protected Personne conducteur;

    public Vehicule(String marque, String modele, int vitesseMax) {
        this.marque = marque.toUpperCase();
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        this.vitesseCourante = 0;
    }

    public void conduire(Personne personne) {
        if (personne.isHasPermis())
            conducteur = personne;
    }

    public void accelerer(int acceleration) {
        if (conducteur == null)
            return;
        if (acceleration <= 0)
            return;
        vitesseCourante = Math.min(vitesseCourante + acceleration, vitesseMax);
    }

    public void ralentir(int desceleration) {
        if (desceleration <= 0)
            return;
        vitesseCourante = Math.max(vitesseCourante - desceleration, 0);
    }
}
