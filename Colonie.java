import java.util.*;

class Colonie {


 private ArrayList<Drone>drones=new ArrayList<>();
 private Terrain terrainActuel;

 public Colonie(Drone[] drones, Terrain terrainActuel) throws Exception {
  this.terrainActuel = terrainActuel;

   if (drones != null && drones.length>0){
     for (int i =0; i<=drones.length-1;i++){
   drones[i].setTerrain(this.terrainActuel);
  }
  this.drones.addAll(List.of(drones));
   }

   else {
     throw new Exception ("tableau de drones vide ou null") ;
   }

  

 }

 public void ajouterDrone (Drone nouveauDrone){
  nouveauDrone.setTerrain(this.terrainActuel);
  this.drones.add(nouveauDrone);
 }

 public void supprimerDrone (String nomDuDrone){
  Iterator<Drone> it = drones.iterator();
  while (it.hasNext()){
   Drone d = it.next();
    if (d.getNomDuDrone().equals(nomDuDrone)){
      it.remove();
    }
  }
 }

 public TreeSet<String> listerNom (){
  TreeSet<String> listeNom=new TreeSet<>();

  for (Drone d : drones){
   listeNom.add(d.getNomDuDrone());
  }
  return listeNom;
 }

 public ArrayList<String> getDeplacements (String nom) throws Exception{

  ArrayList<String>Deplacements= null;
  Iterator<Drone> it = drones.iterator();

  while (it.hasNext()){
   Drone d = it.next();
   if (d.getNomDuDrone().equals(nom)){
   Deplacements= d.getHistoriquePosition();
   }
  }
if (Deplacements==null)   throw new Exception ("Mauvais nom de drone");
else
  return Deplacements;
 }

 public HashSet<String> getOccupation (){
  HashSet<String> Occupation = new HashSet<>();

  for (Drone d : drones){
  Occupation.add(d.getPositionActuelle().toString());
  }


  return Occupation;
 }


}
