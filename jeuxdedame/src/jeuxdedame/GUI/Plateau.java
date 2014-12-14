package jeuxdedame.GUI;

import jeuxdedame.model.Couleur;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class Plateau extends JPanel {
	
	
	private static final int TAILLE = 10;
	
	//private Case caseActive;
	

	
	
	/*Constructeur du plateau de jeu*/
	public Plateau() {
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
        initialisation();
	}
	
	/*Méthode permettant d'ajouter des case pour le plateau
        *@param couleur : définit de quelle couleur sera la case
        */
	private void ajouterCase(Couleur couleur){
		Case case1 = new Case(couleur);
		//case1.addMouseListener(new ListenerCase(case1, this));
		add(case1);
		
	}
        /*Méthode permettant de créer des pions
        *@param couleur : définit de quelle couleur sera le pion
        *@param monte : définit si les pions se déplacent en montant ou descendant
        */
        private Pion creerPion(Couleur couleur, boolean monte){
            Pion pion = new Pion(couleur, monte);
            return pion;
        }
        
        
        /*Méthode initialisant les pions sur le plateau de jeu*/
        private void initialisation(){
            for(int j=0; j<TAILLE*4; j+=1){
                getCase(TAILLE*TAILLE-j-1).add(creerPion(Couleur.BLANC, true));
            }
            for(int i=0; i<TAILLE*1; i+=2){
                getCase(i).add(creerPion(Couleur.NOIR, false));
            }
            for(int i=11; i<TAILLE*2; i+=2){
                getCase(i).add(creerPion(Couleur.NOIR, false));
            }
            for(int i=20; i<TAILLE*3; i+=2){
                getCase(i).add(creerPion(Couleur.NOIR, false));
            }
            for(int i=31; i<TAILLE*4; i+=2){
                getCase(i).add(creerPion(Couleur.NOIR, false));
            }
        }
        
      

        public Case getCase(int i){
            return  (Case) getComponent(i);
        }
	
	

}
