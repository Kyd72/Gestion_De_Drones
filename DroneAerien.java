 class DroneAerien extends Drone {

    private static final int NOMBRE_DE_CASE_DEPLACEMENT = 2; // la distance de déplacement
    private  double hauteurDeVol=2.5 ;




    //Constructeur
    public DroneAerien (String nomDuDrone, Terrain t) {
        super(nomDuDrone,t);


    }

     public DroneAerien (String nomDuDrone){
         super(nomDuDrone);


     }
     public DroneAerien (String nomDuDrone, Terrain t, double hauteurDeVol) throws Exception {
       this(nomDuDrone,t);
       if (hauteurDeVol>=0){
         
         this.hauteurDeVol=hauteurDeVol;
       }
       else {
         throw new Exception ("Hauteur de vol négative ou nulle");
       }
         
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
    public String toString(){

        return "Drone Aerien---- Nom :"+this.nomDuDrone+" Hauteur de vol : "+this.hauteurDeVol+"-- Adresse:  "+this.positionActuelle+"-- Historique: "+historiquePosition;

    }







     @Override
     protected void seDeplacer(int ligne, int colonne) throws Exception {

         if (ligne<= terrainActuel.getNombreDeLignes() && colonne<= terrainActuel.getNombreDeColonnes() ){
          int distanceDeplacementLigne=Math.abs((positionActuelle.getCoordLigne()-ligne));
          int distanceDeplacementColonne=Math.abs((positionActuelle.getCoordColonne()-colonne));

          if ( (distanceDeplacementLigne==NOMBRE_DE_CASE_DEPLACEMENT && distanceDeplacementColonne==0 ) ||(distanceDeplacementLigne==0 && distanceDeplacementColonne==NOMBRE_DE_CASE_DEPLACEMENT ) ){
            positionActuelle.setCoordLigne(ligne);
            positionActuelle.setCoordColonne(colonne);
          }

          else { throw new Exception("Déplacement erroné pour ce type de drone");
          }
            
        }

      else {
        throw new Exception("Zone hors du terrain de surveillance");
      }

     }
 }
