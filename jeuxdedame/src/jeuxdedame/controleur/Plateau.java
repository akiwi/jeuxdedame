/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuxdedame.controleur;

/**
 *
 * @author Damien Thiry
 */
public class Plateau extentds JPanel {
    final static public int NB_CASEX = 10;
    final static public int NB_CASEY = 10;
    static private Plateau plateau = new Plateau();
    static private AireCases [][] aireCases = new AireCases[NB_CASESX][NB_CAESEY];
    


private Plateau(){
    int x, y;
    for(x=0; x<NB_CASEX; x++){
        case[x][y] = Case.White;
        for(y=1; y=NB_CASEY; y++){
            Case[x][y] = Case.noir;
            AireCases[x][y] = new AireCases;
        }
    }
}

public void initialisation(){
    int x = nb/4;
    int y = ((x-1)%2+(nb%4));
    
    if(couleur == Piece.WHITE){
        x = plateau.NB_CASEX-x-1;
        y = plateau.NB_CASEY-y-1;
    }
}
}
