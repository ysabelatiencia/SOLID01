/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosM;


import LecheM.LecheDeslactosada;
import LecheM.LecheDescremada;

/**
 *
 * @author Pedro Mendoza
 */
public class CambioLeche {
    
    public void cambiarTipoLecheDescremada(LecheDescremada ldescrem){
        ldescrem.usar();
    }
    
    public void cambiarTipoLecheDeslactosada(LecheDeslactosada ldeslac){
        ldeslac.usar();
    }    
}
