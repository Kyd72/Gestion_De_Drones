import java.util.ArrayList;


abstract class Drone {
     Case positionActuelle;
    protected String nomDuDrone ;
    protected static int compteurDeMac=0;
    protected   int adresseMac;

    protected Case positionInitiale;

    protected ArrayList<String> historiquePosition= new ArrayList<>();

    protected Terrain terrainActuel = new Terrain(10,10);

    //******** Constructeurs

    protected Drone(String nomDuDrone, Terrain terrainActuel){
        this.nomDuDrone=nomDuDrone;
        this.adresseMac=compteurDeMac;
        this.terrainActuel = terrainActuel;
        compteurDeMac++;
        positionInitiale=new Case(((int) (Math.random()* terrainActuel.getNombreDeLignes())),((int) (Math.random()* terrainActuel.getNombreDeColonnes())) );
        this.positionActuelle=positionInitiale;
        this.historiquePosition.add(positionActuelle.toString());
    }

    protected Drone(String nomDuDrone){
        this.nomDuDrone=nomDuDrone;
        this.adresseMac=compteurDeMac;
        compteurDeMac++;
        positionInitiale=new Case(((int) (Math.random()*this.terrainActuel.getNombreDeLignes())),((int) (Math.random()*this.terrainActuel.getNombreDeColonnes())) );
        this.positionActuelle=positionInitiale;
        this.historiquePosition.add(positionActuelle.toString()+" sur terrain : "+this.terrainActuel.toString());
    }


    //************ Getters


    public Case getPositionActuelle() {
        return positionActuelle;
    }

    public int getAdresseMac() {
        return adresseMac;
    }

    public Case getPositionInitiale() {
        return positionInitiale;
    }

    public ArrayList<String> getHistoriquePosition() {
        return historiquePosition;
    }

    public String getNomDuDrone() {
        return nomDuDrone;
    }

    //******Setters


    public void setNomDuDrone(String nomDuDrone) {
        this.nomDuDrone = nomDuDrone;
    }

    protected void setTerrain( Terrain nouveauTerrain){

        this.terrainActuel =nouveauTerrain;
        this.positionActuelle= new Case(((int) (Math.random()* terrainActuel.getNombreDeLignes())),((int) (Math.random()* terrainActuel.getNombreDeColonnes())) );
        this.historiquePosition.add(positionActuelle.toString()+" sur nouveau terrain : "+this.terrainActuel.toString());

        //déplacement en 0-0 à chaque changement de terrain et suppression de l'ancienne historique
        /*Iterator<String> i=historiquePosition.iterator();
        while (i.hasNext()){
            i.next();
            i.remove();

        }*/


    }

    protected abstract void seDeplacer(int ligne, int colonne) throws Exception;

}
