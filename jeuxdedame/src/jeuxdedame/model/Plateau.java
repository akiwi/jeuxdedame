/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.model;

/**
 *
 * @author Jiksaa
 */
public class Plateau {
    private int longueur;
    private int largeur;
    private Case[][] aireCases;
    
    public Case[][] getAireCases() {
        return aireCases;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    public void setAireCases(Case[][] aireCases) {
        this.aireCases = aireCases;
    }
    
      
}
