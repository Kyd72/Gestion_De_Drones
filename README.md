# Gestion_De_Drones

# Les drones
On désire simuler la surveillance d'un terrain par une colonie de drones.

Par mesure de simplification le terrain est modélisé par un rectangle de N x N cellules (10 < N < 100).

Chaque cellule est numérotée à l’aide d’un couple d’entiers (n° ligne, n° colonne).

On dispose de deux types de drones :

• le drone terrestre : il dispose d’un certain nombre de roues (3, 4 ou 6) et de sa position sur la zone à surveiller (numéro de case). Il se déplace d’une case horizontalement, verticalement ou en diagonale, en restant sur le terrain.

• le drone aérien : il dispose de sa position sur la zone à surveiller (numéro de case) et de sa hauteur de vol. Il se déplace de deux cases horizontalement ou verticalement (mais jamais en diagonale), en restant sur le terrain.

Tous les drones sont capables de mémoriser leurs déplacements c’est-à-dire la liste des cases qu’ils ont visitées (les cases sont mémorisées dans l'ordre des déplacements).

Enfin, un drone possède une adresse MAC (on supposera que c'est un entier compris entre 0 et 10000) ainsi qu'un nom (chaîne de caractères), ils sont uniques.

Pour plus de facilité, c’est ce dernier qui est utilisé pour les commandes.

# ÉTAPE 1 : MODELISATION DES DRONES
Écrire les classes pour modéliser les drones terrestres et aériens : Drone, DroneAerien, DroneTerrestre.

À sa création, un drone est placé aléatoirement sur une des 100 premières cases (n° ligne entre 0 et 9 et n° de colonne entre 0 et 9).
La hauteur par défaut d’un drone aérien est de 2,5 mètres.

En plus des getters, setters et constructeurs on devra pouvoir déplacer un drone avec la méthode bouger(numLigne, numColonne).

Indication : vous pouvez aussi écrire une classe Case qui modélise une case du terrain.

# ÉTAPE 2 : MODELISATION DE LA COLONIE
Écrire la classe Colonie qui modélise la surveillance d’une colonie de drones.

Un tableau de drones et la taille de la zone à surveiller sont donnés à la création.

On doit pouvoir accéder rapidement à un drone donné (à l'aide de son nom, qui est unique).

On devra pouvoir ajouter et supprimer un drone à la colonie (méthodes supprimerDrone() et ajouterDrone()).

La classe Colonie doit proposer les méthodes suivantes :

• listerNom() : retourne les noms des drones (classés par ordre alphabétique),

• getDeplacements(nom) : retourne les déplacements d'un drone donné (ordre chronologique)

• getOccupation) : retourne les cases du terrain qui sont occupées (un case occupée par plusieurs drones ne sera citée qu'une fois)

# ÉTAPE 3: AMELIORATION
Ajouter le code pour vérifier que le déplacement d’un drone est conforme au déplacement autorisé (saut d'une case horizontalement, verticalement ou en diagonale pour un drone terrestre / saut de deux cases horizontalement, ou verticalement pour un drone aérien).

Ajouter le code pour vérifier que le drone ne sort pas du terrain.

POUR LES TESTS Utiliser la méthode main() fournie.
