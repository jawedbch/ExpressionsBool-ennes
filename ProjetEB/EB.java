/**
 * @author Baouche Mohamed Djaouad
 */

// Classe représentant l'expression booléenne
public class EB {
    public final Noeud racine; // La racine de l'arbre
    private final int k; // Le nombre de variables

    // Constructeur pour une expression booléenne avec une racine et un nombre de variables
    public EB(Noeud racine, int k) {
        this.racine = racine;
        this.k = k;
    }

    // Evaluer une expression booléenne à partir d'un nœud
    private boolean evaluerNoeud(Noeud noeud, boolean[] valeurs) {
        if (noeud == null) {
            return false; // Valeur par défaut si le nœud est nul
        }
        if (Character.isAlphabetic(noeud.valeur)) {
            // Si le nœud est une variable, retourner sa valeur dans le tableau de valeurs
            return valeurs[noeud.valeur - 'a']; // Convertir le caractère en indice de tableau
        } else {
            // Sinon, évaluer récursivement les sous-arbres en fonction de l'opérateur
            return switch (noeud.valeur) {
                case '&' -> // Conjonction
                        evaluerNoeud(noeud.gauche, valeurs) && evaluerNoeud(noeud.droit, valeurs);
                case '|' -> // Disjonction
                        evaluerNoeud(noeud.gauche, valeurs) || evaluerNoeud(noeud.droit, valeurs);
                case '!' -> // Négation
                        !evaluerNoeud(noeud.gauche, valeurs);
                default -> false; // Valeur par défaut si l'opérateur est inconnu
            };
        }
    }

    // Evaluer l'expression booléenne avec un tableau de valeurs
    public boolean evaluer(boolean[] valeurs) {
        return evaluerNoeud(racine, valeurs);
    }

    // Formater l'expression booléenne
    private String AfficherNoeud(Noeud noeud) {
        if (noeud == null) {
            return "";
        }
        if (Character.isAlphabetic(noeud.valeur)) {
            return Character.toString(noeud.valeur);
        } else {
            String gauche = AfficherNoeud(noeud.gauche);
            String droit = AfficherNoeud(noeud.droit);
            return switch (noeud.valeur) {
                case '&' -> // Conjonction
                        "(" + gauche + " ∧ " + droit + ")";
                case '|' -> // Disjonction
                        "(" + gauche + " ∨ " + droit + ")";
                case '!' -> // Négation
                        "¬" + gauche;
                default -> "";
            };
        }
    }

    // Afficher l'expression booléenne
    public void afficher_e() {
        System.out.println("e = " + AfficherNoeud(racine));
    }
    public void afficher_f() {
        System.out.println("f = " + AfficherNoeud(racine));
    }


}
