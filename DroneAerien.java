 class DroneAerien extends Drone {

    private static final int NOMBRE_DE_CASE_DEPLACEMENT = 2; // la distance de déplacement
    private  float hauteurDeVol= 2.5F;




    //Constructeur
    public DroneAerien (String nomDuDrone, Terrain t) throws Exception {
        super(nomDuDrone,t);


    }

     public DroneAerien (String nomDuDrone) throws Exception{
         super(nomDuDrone);


     }
     public DroneAerien (String nomDuDrone, Terrain t, float hauteurDeVol) throws Exception {
         super(nomDuDrone,t);

       if (hauteurDeVol>0){
         
         this.hauteurDeVol=  hauteurDeVol;
       }
       else {
         throw new Exception ("Hauteur de vol négative ou nulle");
       }
         
     }

     public DroneAerien (String nomDuDrone, float hauteurDeVol) throws Exception{
         this(nomDuDrone);


         if (hauteurDeVol>0){

             this.hauteurDeVol=  hauteurDeVol;
         }
         else {
             throw new Exception ("Hauteur de vol négative ou nulle");
         }

     }


     //Getter


     public double getHauteurDeVol() {
         return hauteurDeVol;
     }

   @Override
    public String toString(){

        return "Drone Aerien---- Nom :"+this.nomDuDrone+" Hauteur de vol : "+this.hauteurDeVol+"-- Position actuelle:  "+this.positionActuelle+" ---- Adresse MAC :"+super.adresseMac+"-- Historique: "+historiquePosition;

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
