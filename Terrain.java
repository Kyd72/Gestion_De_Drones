import java.util.ArrayList;

 class Terrain {

    private int nombreDeLignes=10;
    private int nombreDeColonnes=10;

    private ArrayList<Integer> lignesTerrain=new ArrayList<Integer>();
    private ArrayList<Integer> colonnesTerrain=new ArrayList<Integer>();

    // Constructeur
    public Terrain(){
       /* for (int j =0;j<this.nombreDeLignes;j++) {
            lignesTerrain.add(j);

        }
        for (int j =0;j<this.nombreDeColonnes;j++) {
            colonnesTerrain.add(j);

        }*/



    }  // crée terrain 100 cases par défaut

    public Terrain(int nombreDeLignes, int nombreDeColonnes){

        this.nombreDeColonnes=nombreDeColonnes;
        this.nombreDeLignes=nombreDeLignes;

        /*for (int j =0;j<this.nombreDeLignes;j++) {
            lignesTerrain.add(j);

        }

        for (int j =0;j<this.nombreDeColonnes;j++) {
            colonnesTerrain.add(j);

        }*/


    } // crée un terrain de dimensions personnalisées


    //Getters

    public int getNombreDeLignes() {
        return nombreDeLignes;
    }

    public int getNombreDeColonnes() {
        return nombreDeColonnes;
    }


    //Methode de classe

    // créer une case en prenant une ligne et une colonne du tableau puis supprimer la ligne et la colonne pour qu'elles soient inaccessibles

    /*protected boolean ligneArrivee(int ligne){  //obtenir une ligne du terrain et la supprimer

        if (lignesTerrain.contains(ligne)){
            lignesTerrain.remove(ligne);
            return true;
        }
        else {
            return false;// pour signaler une tentative d'accès à une zone non définie
        }


    }

    protected boolean colonneArrivee(int colonne){   // obtenir une colonne du terrain

        if (colonnesTerrain.contains(colonne)){
            colonnesTerrain.remove(colonne);
            return true;
        }
        else {
            return false; // pour signaler une tentative d'accès à une zone non définie
        }


    }

    protected boolean ligneDepart(int ligne){  //obtenir une ligne du terrain et la supprimer

        if (!lignesTerrain.contains(ligne)){
            lignesTerrain.add(ligne);
            return true;
        }
        else {
            return false;// pour signaler une tentative d'accès à une zone non définie
        }


    }

    protected boolean colonneDepart(int colonne){   // obtenir une colonne du terrain

        if (!colonnesTerrain.contains(colonne)){
            colonnesTerrain.add(colonne);
            return true;
        }
        else {
            return false; // pour signaler une tentative d'accès à une zone non définie
        }


    }*/

    // ajouter une ligne et colonne lorsqu'elles sont libérées grâce à un déplacement d'un drone


    // déterminer si une case est disponible




}
