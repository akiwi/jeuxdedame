
package jeuxdedame.model;

/**
 *
 * @author Jiksaa
 */
public class Plateau {
    final int NB_X=9;
    final int NB_Y=9;
    
    private int longueur;
    private int largeur;
    private Case[NB_X][NB_Y] aireCases;
    
    
    public Case[NB_X][NB_Y] getAireCases() {
        int axeX,axeY;
        for(axeX=0;axeX<=NB_X-1;axeX++){
           for(axeY=0;axeY<=NB_Y-1;axeY++){
               this.aireCases[axeX][axeY].coordo=1
            } 
        }
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
    
    public void setAireCases(Case[NB_X][NB_Y] aireCases) {
        this.aireCases = aireCases;
    }

    public Plateau(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        
        for(int i=0;i<this.aireCases;i++){
            for(int j=0;j<this.aireCases[i];j++){
                if(i%2 == 0){
                   if(j%2 == 0){
                       this.aireCases[i][j] = new aireCases(aireCases.BLANC);
                   }
                   this.aireCases[i][j] = new aireCases(aireCases.NOIR);
                }
            }
        }
    }
    
 
}
