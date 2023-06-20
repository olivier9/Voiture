public class Affichage {


    public static void afficher(Vehicule vehicule) {
        System.out.printf("%n%nMarque           : %s%n", vehicule.marque);
        System.out.printf("Modèle           : %s%n", vehicule.modele);
        System.out.printf("Vitesse Max.     : %s%n", vehicule.vitesseMax);
        if (vehicule.conducteur != null)
            System.out.printf("Conducteur       : %s%n", vehicule.conducteur);
        System.out.printf("Vitesse Courante : %s%n", vehicule.vitesseCourante);

        if (vehicule instanceof Voiture)
            afficher((Voiture) vehicule);
        else if (vehicule instanceof Camion)
            afficher((Camion) vehicule);

    }

    private static void afficher(Voiture voiture) {
        System.out.printf("Passagers       ");
        for (int i = 0; i < voiture.getPassagers().length; i++) {
            System.out.printf(" - %s%n                ", voiture.getPassagers()[i]);
        }
    }

    private static void afficher(Camion camion) {
        System.out.printf("Charge utile     : %s%n", camion.getChargeUtile());
        System.out.printf("Déjà chargé      : %s%n", camion.getChargement());
        System.out.printf("Disponible       : %s%n", camion.getChargeUtile() - camion.getChargement());
    }
}
