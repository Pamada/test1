public class Main {
    private static Object TestVehicules;

    public static void main(String[] args) {

        Vehicule v1;
        Vehicule v2;
        v1 = new Voiture();
        v2 = new Avion();

        //appels polymorphique
        v1.avancer();  //appele avancer de la voiture
        v2.avancer();   //appele avancer de l'avion

        //la ligne suivante ne compile pas:Erreur?!
        //"Vehicule est abstract , can not be instantier
        //Vehicule v3 = new Vehicule();

        TestVehicules.testVehicule();
;        System.out.println("Hello world!");
    }
}