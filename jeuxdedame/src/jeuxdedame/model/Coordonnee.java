/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.model;

public class Coordonnee {
    private int x;
    private int y;

    public Coordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "Coordonnee{" + "x=" + x + ", y=" + y + '}';
    }
}
