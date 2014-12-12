package jeuxdedame.GUI;

import jeuxdedame.model.Couleur;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class Plateau extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static final int TAILLE = 9;
	
	//private Case caseActive;
	

	
	
	/**
	 * Create the panel.
	 */
	public Plateau(int taille) {
		setLayout(new GridLayout(TAILLE, TAILLE));
		for(int i=0; i<TAILLE; i++){
            for(int j=0; j<TAILLE; j++){
                if((j%2==0 && i%2==0) || (j%2!=0 && i%2!=0)){
                    ajouterCase(Couleur.NOIR);
                }
                else{
                    ajouterCase(Couleur.BLANC);
                }
            }
        }

	}
	
	
	private void ajouterCase(Couleur couleur){
		Case case1 = new Case(couleur);
		//case1.addMouseListener(new ListenerCase(case1, this));
		add(case1);
		
	}
        
        
        
        private void initialiser(){
            for(int j=0; j<TAILLE*3; j+=2){
                
            }
        }
	
	

}
