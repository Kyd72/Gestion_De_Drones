public class TestDronesException {

    public static void main(String[] arg) {

        // TEST 1

        DroneTerrestre d1 = new DroneTerrestre("Wall-E1", Roue.UN);  // nom  nbRoues
        System.out.println(d1);


        // TEST 2

        DroneAerien d2 = new DroneAerien("Eve1",-2.0f); // nom adresse hauteur
        System.out.println(d2);


        // TEST 3

        Drone[] drones=null;
        Colonie colo = new Colonie(drones, new Terrain());
        System.out.println(colo);


        // TEST 4

        Colonie colo2=new Colonie( new Drone[]{d1}, new Terrain());
        System.out.println("les déplacements du drone sont : \n " + colo2.getDeplacements("Bizarre"));

    }
}
