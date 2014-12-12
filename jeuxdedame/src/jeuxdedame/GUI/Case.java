package jeuxdedame.GUI;

import jeuxdedame.model.Couleur;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;


public class Case extends JPanel{
	
	
	private static final long serialVersionUID = 1L;

	/*D�finit la couleur d'une case (Noir ou Blanc)*/
	private Couleur couleur;
	
	/*Variable logique definissant une case selectionn�e*/
	private boolean selection;
	
	/*Constructeur d'une case*/
	public Case(Couleur couleur){
		this.couleur = couleur;
		setLayout(new GridLayout(1,0));
		initialisationCouleur();
		
		
	}
	
	/*Methode permettant de mettre la variable selection a l'etat vrai*/
	public boolean estSelectionnee(){
		return selection;
	}
	
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
		
	
		
	
	
	
	

