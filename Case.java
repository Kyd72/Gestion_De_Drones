
import java.util.Objects;

class Case {

private int coordLigne;
private int coordColonne;

//Constructeur

    public Case (int coordLigne, int coordColonne){
        this.coordLigne=coordLigne;
        this.coordColonne=coordColonne;
    }
// getter
    public int getCoordLigne() {
        return coordLigne;
    }

    public int getCoordColonne() {
        return coordColonne;
    }

    //Setters


    public void setCoordLigne(int coordLigne) {
        this.coordLigne = coordLigne;
    }

    public void setCoordColonne(int coordColonne) {
        this.coordColonne = coordColonne;
    }

    @Override
    public String toString (){
        return "( Ligne: "+this.coordLigne+")"+ "( Colonne : "+this.coordColonne+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return getCoordLigne() == aCase.getCoordLigne() && getCoordColonne() == aCase.getCoordColonne();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoordLigne(), getCoordColonne());
    }
}
