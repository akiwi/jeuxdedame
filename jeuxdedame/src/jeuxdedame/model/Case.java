/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.model;

public class Case {
    private Coordonnee coordonnee;
    private Couleur couleur;
    private boolean occupe;
    private Piece occupePar;

    public Couleur getCouleur() {
        return couleur;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public Piece getOccupePar() {
        return occupePar;
    }

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }
    
    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }
    
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }

    public void setOccupePar(Piece occupePar) {
        this.occupePar = occupePar;
    }
    
    
}
