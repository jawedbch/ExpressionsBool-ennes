# 🤖 Expressions Booléennes – TAD EB(K)

Projet réalisé dans le cadre du TP d'Algorithmique et Programmation 5 — Université du Havre

---

## 👨‍💻 Auteur

**Baouche Mohamed Djaouad**

---

## 🎯 Objectif

Implémenter le **type abstrait de données EB(K)** représentant une **expression booléenne** à K variables, à l'aide d'arbres binaires.  
Ce projet permet de :

- Construire récursivement une expression booléenne
- L'évaluer à partir d’un vecteur de valeurs

---

## 🧩 Définition d'une expression booléenne (EB)

Une expression booléenne peut être :

- Une **variable** (ex: `a`, `b`, `c`) → singleton
- Une **négation** : `¬e`
- Une **disjonction** : `e ∨ f`
- Une **conjonction** : `e ∧ f`
- Une **expression vide** (cas particulier, non évaluable)

EB(K) signifie que les variables sont prises parmi les **K premières lettres** (`a` à `z`) et que le vecteur de test est de taille K.

---

## 📦 Fonctionnalités principales

### 🔨 Construction

- `singleton(char c)`
- `conjonction(EB e1, EB e2)`
- `disjonction(EB e1, EB e2)`
- `negation(EB e)`

### 👁️ Affichage

- Affichage en **notation infixée** (avec parenthèses)
- Optionnel : affichage arborescent

### ✅ Évaluation

- `evaluer(EB e, boolean[] v)` : retourne `true` ou `false` selon le vecteur de vérité donné

### 🔎 Autres

- `estVide()` : vérifie si l’expression est vide
- Méthodes internes : accesseurs, toString(), etc.

---

## 🧪 Tests réalisés

- **Expression 1** :
  ```txt
  e = (¬a ∨ (b ∧ c)) ∧ ¬c
  
- **Expression 2** :
  ```txt
  f = ¬((¬a ∧ (c ∨ a)) ∨ ¬(b ∧ d))

---

## 🧠 Structure de données
- `EB.java` : Classe principale représentant une expression booléenne
- `Noeud.java` : Structure d'un nœud de l'arbre (char, gauche, droite)
- `Main.java` : Classe de test : création, affichage, évaluation
- `README.md` : ce fichier
- `LICENSE` : licence du projet (MIT, par exemple)
