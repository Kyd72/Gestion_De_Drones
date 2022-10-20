class DroneTerrestre extends Drone{

    private static final int NOMBRE_DE_CASE_DEPLACEMENT = 2; // la distance de déplacement

    Roue nombreDeroue;




    //Constructeur
    public DroneTerrestre (String nomDuDrone,  Roue nombreDeroue){
        super(nomDuDrone);
        this.nombreDeroue=nombreDeroue;

    }
    public DroneTerrestre (String nomDuDrone, Terrain t, Roue nombreDeroue){
        super(nomDuDrone,t);
        this.nombreDeroue=nombreDeroue;

    }

    //Getter


    public Roue getNombreDeroue() {
        return nombreDeroue;
    }

    @Override
    public String toString(){

        return "Drone Terrestre----Nom :"+this.nomDuDrone+"--------Nombre de roues : "+this.nombreDeroue;

    }





    @Override
    protected void seDeplacer(int ligne, int colonne) {

        if (ligne<= terrainActuel.getNombreDeLignes() && colonne<= terrainActuel.getNombreDeColonnes() ){
            positionActuelle.setCoordLigne(ligne);
            positionActuelle.setCoordColonne(colonne);
        }

    }
}
