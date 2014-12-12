/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.GUI;

import java.awt.Color;
import javax.swing.JPanel;
import jeuxdedame.model.Couleur;

/**
 *
 * @author Damien Thiry
 */
public class Pion extends JPanel {
    
    private Couleur couleur;
    
    public Pion(Couleur couleur, boolean monte) {
        this.couleur = couleur;
        switch (couleur) {
        case BLANC :
            setForeground(Color.WHITE);
            setBackground(new Color(220, 220, 220));
            break;
        case NOIR :
            setForeground(new Color(70, 70, 70));
            setBackground(new Color(200, 200, 200));
            break;
        }
    }
    
    
    
    
}
