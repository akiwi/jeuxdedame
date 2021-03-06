/**
 *
 */
package jeuxdedame.model;

import static jeuxdedame.model.Couleur.NOIR;

/**
 * @author he201119
 *
 */
public class Pion extends Piece {

    
    public boolean prendre(int x,int y){ 
        if(Joueur.couleur == NOIR){
            while(avancer == true){
                if(pion.case[x+1][y+1].this.occupe==true){
                    pion.plateau.case[x][y]=pion.plateau.case[x+2][y+2];
                    joueur.this.nbPiece=joueur.this.nbPiece-1;
                }
                else if(pion.case[x-1][y+1].this.occupe==true){
                    pion.plateau.case[x][y]=pion.plateau.case[x-2][y+2];
                    joueur.this.nbPiece=joueur.this.nbPiece-1;
                }
            }
        }
        else{
            while(avancer == true){
                if(pion.case[x+1][y+1].this.occupe==true){
                    pion.plateau.case[x][y]=pion.plateau.case[x+2][y+2];
                    joueur.this.nbPiece=joueur.this.nbPiece-1;
                }
                else if(pion.case[x-1][y+1].this.occupe==true){
                    pion.plateau.case[x][y]=pion.plateau.case[x-2][y+2];
                    joueur.this.nbPiece=joueur.this.nbPiece-1;
                }
            }
        }
    }


    public boolean avancer(int x,int y){ 
        if(==false){
            pion.plateau.case[x][y]=pion.plateau.case[x+1][y+1];
            
        }
        
        else if(pion.case[x-1][y+1].this.occupe==true){
            pion.prendre(x, y);
        
           
        }
        
        else 
    }

}
