public class Main {

  public static void main( String[] args){

    DroneTerrestre d1 = new DroneTerrestre("Wall-E1",  Roue.QUATRE);  // nom  nbRoues
    DroneTerrestre d2 = new DroneTerrestre("Wall-E2", Roue.QUATRE);

    System.out.println(d1);
    // DroneTerrestre : {nom=Wall-E1, adresse=11, position=(9, 2), dep=[]}
    // les numéros de case peuvent être différents pour vous

        DroneAerien d3 = new DroneAerien("Eve1", 2.0f); // nom hauteur
        d3.seDeplacer(d3.getPositionActuelle().getCoordLigne() + 2, d3.getPositionActuelle().getCoordColonne());
        d3.seDeplacer(d3.getPositionActuelle().getCoordLigne(), d3.getPositionActuelle().getCoordColonne() - 2);
        d3.seDeplacer(d3.getPositionActuelle().getCoordLigne(), d3.getPositionActuelle().getCoordColonne() - 2);

        System.out.println(d3);
        // DroneAerien : {nom=Eve1, adresse=21, position=(3, 5), dep=[(1, 9), (3, 9), (3, 7)]}


        // les 2 bouger() suivants ne doivent pas déplacer le drone (déplacement non autorisé)
        d1.seDeplacer(d1.getPositionActuelle().getCoordLigne() + 4, d1.getPositionActuelle().getCoordColonne());
        System.out.println(d1);
        d3.seDeplacer(d3.getPositionActuelle().getCoordLigne() + 1, d3.getPositionActuelle().getCoordColonne() + 1);
        System.out.println(d3);

        // la colonie...
        Colonie colo = new Colonie(new Drone[]{d1, d2, d3},new Terrain(20,20) ); // table de drones, terrain

        colo.ajouterDrone(new DroneTerrestre("Wall-E3",  Roue.QUATRE));
        colo.ajouterDrone(new DroneAerien("Eve2", 22));
        colo.ajouterDrone(new DroneAerien("Eve3", 23));

        colo.supprimerDrone("Eve2");

        System.out.println("les noms des drones sont : \n" + colo.listerNom());
        //  Eve1 Eve3 Wall-E1 Wall-E2 Wall-E3

        System.out.println("les déplacements de Eve1 sont : \n " + colo.getDeplacements("Eve1"));

        System.out.println("les cases occupées sont : \n " + colo.getOccupation());
  }




}
