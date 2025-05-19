/**
 * @author Baouche Mohamed Djaouad
 */


public class Main {
    public static void main(String[] args) {
        // Création des nœuds pour l'expression booléenne e
        Noeud e_gauche = new Noeud('!', new Noeud('a', null, null), null);
        Noeud e_droite = new Noeud('|', new Noeud('&', new Noeud('b', null, null), new Noeud('c', null, null)), new Noeud('!', new Noeud('c', null, null), null));
        Noeud e_racine = new Noeud('|', e_gauche, e_droite);
        EB e = new EB(e_racine, 3); // Expression avec 3 variables (a, b, c)

        // Affichage et évaluation de l'expression e
        System.out.print("Expression e : ");
        e.afficher_e();
        boolean[] valeurs_e = {true, false, true};
        System.out.println("Evaluation de e avec les valeurs (a, b, c) = (true, false, true) : " + e.evaluer(valeurs_e));

        // Création des nœuds pour l'expression booléenne f
        Noeud f_gauche = new Noeud('!', new Noeud('&', new Noeud('!', new Noeud('a', null, null), null), new Noeud('|', new Noeud('c', null, null), new Noeud('a', null, null))), null);
        Noeud f_droite = new Noeud('!', new Noeud('&', new Noeud('b', null, null), new Noeud('d', null, null)), null);
        Noeud f_racine = new Noeud('|', f_gauche, f_droite);
        EB f = new EB(f_racine, 4); // Expression avec 4 variables (a, b, c, d)

        // Affichage et évaluation de l'expression f
        System.out.print("\nExpression f : ");
        f.afficher_f();
        boolean[] valeurs_f = {false, true, false, true};
        System.out.println("Evaluation de f avec les valeurs (a, b, c, d) = (true, true, false, true) : " + f.evaluer(valeurs_f));
    }
}
