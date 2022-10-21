class DroneTerrestre extends Drone{

    private static final int NOMBRE_DE_CASE_DEPLACEMENT = 2; // la distance de déplacement

    Roue nombreDeroue;




    //Constructeur
    public DroneTerrestre (String nomDuDrone,  Roue nombreDeroue) throws Exception  {
        super(nomDuDrone);
      if(nombreDeroue instanceof Roue){
        this.nombreDeroue=nombreDeroue;
      }

      else {
        throw new Exception(" Mauvaise déclaration du nombre de roue");
      }
        

    }
    public DroneTerrestre (String nomDuDrone, Terrain t, Roue nombreDeroue) throws Exception {
        super(nomDuDrone,t);
      if(nombreDeroue instanceof Roue){
        this.nombreDeroue=nombreDeroue;
      }

       else {
        throw new Exception(" Mauvaise déclaration du nombre de roue");
      }

    }

    //Getter


    public Roue getNombreDeroue() {
        return nombreDeroue;
    }

    @Override
    public String toString(){

        return "Drone Terrestre----Nom :"+this.nomDuDrone+"--------Nombre de roues : "+this.nombreDeroue+"--------Adresse:  "+this.positionActuelle+"-----------Historique: "+historiquePosition;

    }





    @Override
    protected void seDeplacer(int ligne, int colonne) throws Exception {

        if (ligne<= terrainActuel.getNombreDeLignes() && colonne<= terrainActuel.getNombreDeColonnes() ){
          int distanceDeplacementLigne=Math.abs((positionActuelle.getCoordLigne()-ligne));
          int distanceDeplacementColonne=Math.abs((positionActuelle.getCoordColonne()-colonne));

          if ( (distanceDeplacementLigne+distanceDeplacementColonne <=1) || ((distanceDeplacementLigne==1) && (distanceDeplacementColonne==1) ) ){
            positionActuelle.setCoordLigne(ligne);
            positionActuelle.setCoordColonne(colonne);
          }

          else { throw new Exception("Distance de déplacement élevée pour ce type de drone");
          }
            
        }

      else {
        throw new Exception("Zone hors du terrain de surveillance");
      }

    }
}
