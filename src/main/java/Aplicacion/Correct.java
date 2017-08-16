/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 * @author hp
 */
public abstract class Correct {
    public Correct getCorrMethod(){
        Correct corr = new StaticCreat();
        return corr;
    }
    public abstract CorrMethod createCorrMethod();
}
