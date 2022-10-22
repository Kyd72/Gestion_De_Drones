import java.util.ArrayList;

 class Terrain {

    private int nombreDeLignes=10;
    private int nombreDeColonnes=10;

    private ArrayList<Integer> lignesTerrain=new ArrayList<Integer>();
    private ArrayList<Integer> colonnesTerrain=new ArrayList<Integer>();

    // Constructeur
    public Terrain(){




    }  // crée terrain 100 cases par défaut

    public Terrain(int nombreDeLignes, int nombreDeColonnes){

        this.nombreDeColonnes=nombreDeColonnes;
        this.nombreDeLignes=nombreDeLignes;




    } // crée un terrain de dimensions personnalisées


    //Getters

    public int getNombreDeLignes() {
        return nombreDeLignes;
    }

    public int getNombreDeColonnes() {
        return nombreDeColonnes;
    }


}
