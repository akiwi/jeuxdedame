/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.model;

public abstract class Piece {
    private Couleur couleur;
    private Case position;

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Case getPosition() {
        return position;
    }

    public void setPosition(Case position) {
        this.position = position;
    }
    
    /**
     * eventuellement retourner un object de type coordonnée correspondant à
     * la coordonnée ou se trouve la piece après le déplacement
     */
    public abstract void deplacement(int x, int y);
}
