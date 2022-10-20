 class DroneAerien extends Drone {

    private static final int NOMBRE_DE_CASE_DEPLACEMENT = 2; // la distance de déplacement
    private  double hauteurDeVol=2.5 ;




    //Constructeur
    public DroneAerien (String nomDuDrone, Terrain t){
        super(nomDuDrone,t);


    }

     public DroneAerien (String nomDuDrone){
         super(nomDuDrone);


     }
     public DroneAerien (String nomDuDrone, Terrain t, double hauteurDeVol){
         this(nomDuDrone,t);
         this.hauteurDeVol=hauteurDeVol;
     }

     public DroneAerien (String nomDuDrone, double hauteurDeVol){
         this(nomDuDrone);
         this.hauteurDeVol=hauteurDeVol;
     }


     //Getter


     public double getHauteurDeVol() {
         return hauteurDeVol;
     }







     @Override
     protected void seDeplacer(int ligne, int colonne) {

         if (ligne<= terrainActuel.getNombreDeLignes() && colonne<= terrainActuel.getNombreDeColonnes() ){
             positionActuelle.setCoordLigne(ligne);
             positionActuelle.setCoordColonne(colonne);
         }

     }
 }
