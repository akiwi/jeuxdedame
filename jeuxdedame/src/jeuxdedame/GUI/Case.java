package jeuxdedame.GUI;

import jeuxdedame.model.Couleur;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;


public class Case extends JPanel{
	
	
	
        private int coordonnee;
	/*Définit la couleur d'une case (Noir ou Blanc)*/
	private Couleur couleur;
	
	/*Variable logique definissant une case selectionnée*/
	private boolean selection;
	
	/*Constructeur d'une case
        *@param Couleur
        */
	public Case(Couleur couleur){
		this.couleur = couleur;
		setLayout(new GridLayout(1,0));
		initialisationCouleur();
		
		
	}
        
        public Couleur getCouleur(){
            return couleur;
        }
	
	/*Methode permettant de mettre la variable selection a l'etat vrai*/
	public boolean estSelectionnee(){
		return selection;
	}
	/*Initialisation des couleurs des cases*/
	private void initialisationCouleur(){
		switch(couleur){
		case BLANC : 
			setBackground(Color.WHITE);
			setForeground(new Color(200, 200, 200));
			
			break;
		case NOIR : 
			setBackground(Color.GRAY);
			setForeground(new Color(20, 20, 20));
			break;
		}
		
	}
        
        
        
        
	

}
		
	
		
	
	
	

