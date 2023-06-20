public class Main {



    public static void main(String[] args) {

        Personne jean = new Personne("dupont","Jean");
        Personne pierre = new Personne("dupont","Pierre");
        Personne paul = new Personne("dupont","paul");
        Personne irma = new Personne("dupont","irma");
        Personne eve = new Personne("dupont","eve");
        Personne kevin = new Personne("dupont","kevin");


        Voiture maVoiture = new Voiture("renault","clio",150,5);

        jean.obtenirPermis();
        maVoiture.conduire(jean);
        maVoiture.monter(jean);
        maVoiture.monter(kevin);
        maVoiture.monter(eve);
        maVoiture.monter(kevin);
        maVoiture.monter(irma);
        maVoiture.monter(paul);
        maVoiture.descendre(eve);
        maVoiture.monter(pierre);
        maVoiture.accelerer(120);
        Affichage.afficher(maVoiture);

        Camion monCamion = new Camion("renault", "traffic", 150,800);
        monCamion.charger(125);
        Affichage.afficher(monCamion);

    }

}