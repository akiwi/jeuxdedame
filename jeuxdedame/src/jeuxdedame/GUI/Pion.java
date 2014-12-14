/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.GUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import jeuxdedame.model.Couleur;


/**
 *
 * @author Damien Thiry
 */
public class Pion extends JPanel {
    
    private Couleur couleur; /*Défninit la couleur d'un pion*/
    private boolean monte;  /*Définit si on pion pourra monter ou descendre sur le plateau (les blancs montent et les noirs descendent*/
    
    
    /*Constructeur d'un pion*/
    public Pion(Couleur couleur, boolean monte) { 
        this.monte = monte;
        this.couleur = couleur;
        setOpaque(false);
        switch (couleur) {
        case BLANC :
            setForeground(Color.WHITE);
            setBackground(new Color(220, 220, 220));
            break;
        case NOIR :
            setForeground(Color.BLACK);
            setBackground(new Color(200, 200, 200));
            break;
        }
    }
    
    @Override
    /*Création de la forme du pion*/
    public void paintComponent(Graphics g){
        g.fillOval(5, 5, getWidth()-10, getHeight()-10);
    }


    public Couleur getCouleur() {
        return couleur;
    }

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

}
   
    
    
    
    

