public class TestDronesException {

    public static void main(String[] arg){

        // TEST 1
        try {
            DroneTerrestre d1 = new DroneTerrestre("Wall-E1", Roue.SIX);  // nom  nbRoues
            System.out.println(d1);

            // TEST 4
            try {
                Colonie colo2=new Colonie( new Drone[]{d1}, new Terrain());
                System.out.println("les déplacements du drone sont : \n " + colo2.getDeplacements("Bizarre"));
            }catch (Exception e){System.out.println(e);}

        } catch (Exception e){System.out.println(e);}



        // TEST 2
        try {
            DroneAerien d2 = new DroneAerien("Eve1",-2.0f); // nom adresse hauteur
            System.out.println(d2);

        }catch (Exception e){System.out.println(e);}


        // TEST 3
        try {
            Drone[] drones=null;
            Colonie colo = new Colonie(drones, new Terrain());
            System.out.println(colo);
        }catch (Exception e){System.out.println(e);}






    }
}
