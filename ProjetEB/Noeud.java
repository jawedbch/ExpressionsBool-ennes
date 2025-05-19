// Classe Noeud représentant les nœuds de l'arbre d'expression booléenne
public class Noeud {
    char valeur; // Le caractère représentant l'opérateur ou la variable booléenne
    Noeud gauche; // Le sous-arbre gauche
    Noeud droit; // Le sous-arbre droit

    // Constructeur pour un nœud avec un caractère et deux sous-arbres
    public Noeud(char valeur, Noeud gauche, Noeud droit) {
        this.valeur = valeur;
        this.gauche = gauche;
        this.droit = droit;
    }
}
