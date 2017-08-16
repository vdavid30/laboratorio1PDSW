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
public class StaticCreat extends Correct{
    public CorrMethod createCorrMethod(){
        CorrMethod nOnlineCorr = new  StaticCorr();
        return nOnlineCorr;
    }
}
