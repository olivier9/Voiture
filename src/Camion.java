public class Camion extends Vehicule {

    private int chargeUtile;
    private int chargement;

    public Camion(String marque, String modele, int vitesseMax, int chargeUtile) {
        super(marque, modele, vitesseMax);
        this.chargeUtile = chargeUtile;
        chargement = 0;
    }

    public void charger(int poids) {
        if (chargement + poids <= chargeUtile)
            chargement += poids;
    }
    public void decharger(int poids) {
        if (chargement - poids <= 0)
            chargement -= poids;
    }

    public int getChargeUtile() {
        return chargeUtile;
    }

    public int getChargement() {
        return chargement;
    }
}
