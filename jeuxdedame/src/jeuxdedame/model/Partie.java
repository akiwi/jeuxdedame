/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.model;

public class Partie {
    private int nbPartie;
    private int nbJoueur;
    private Joueur joueurCourant;
    private boolean partieFinie;
    
    

    public int getNbPartie() {
        return nbPartie;
    }

    public void setNbPartie(int nbPartie) {
        this.nbPartie = nbPartie;
    }

    public int getNbJoueur() {
        return nbJoueur;
    }

    public void setNbJoueur(int nbJoueur) {
        this.nbJoueur = nbJoueur;
    }

    public Joueur getJoueurCourant() {
        return joueurCourant;
    }

    public void setJoueurCourant(Joueur joueurCourant) {
        this.joueurCourant = joueurCourant;
    }

    public boolean isPartieFinie() {
        return partieFinie;
    }

    public void setPartieFinie(boolean partieFinie) {
        this.partieFinie = partieFinie;
    }

    public Joueur getGagnant(){
        Joueur gagnant = false;
        if(this.PartieFinie()){
            joueurCourant.getNbPiece()==0;
            gagnant == joueurCourant;
        }
        return gagnant;
    }
    
}
