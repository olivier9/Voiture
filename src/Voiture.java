public class Voiture extends Vehicule {


    private int nombrePlaces;
    private Personne[] passagers;

    public Voiture(String marque, String modele, int vitesseMax, int nombrePlaces) {
        super (marque,modele,vitesseMax);
        this.nombrePlaces = nombrePlaces;
        passagers = new Personne[nombrePlaces - 1];
    }

    public Personne[] getPassagers() {
        return passagers;
    }

    public void monter(Personne personne) {
        if (vitesseCourante > 0 || isInVoiture(personne))
            return;
        int position = indexOf(null);
        if (position != -1)
            passagers[position] = personne;
    }

    private boolean isInVoiture(Personne personne) {
        return conducteur == personne || indexOf(personne) != -1;
    }

    private int indexOf(Personne personne) {
        int position = -1;
        int i = 0;
        while (position == -1 && i < nombrePlaces - 1) {
            if (passagers[i] == personne)
                position = i;
            i++;
        }
        return position;
    }

    public void descendre(Personne personne) {
        int position = indexOf(personne);
        if (position != -1)
            passagers[position] = null;
    }
}
