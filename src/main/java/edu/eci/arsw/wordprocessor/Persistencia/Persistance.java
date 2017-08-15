/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.wordprocessor.Persistencia;


/**
 *
 * @author Estevan
 */
public class Persistance {
    
    public PerMethod createPerMethod(){ 
        Persistance metodo= new SerialCreator();
        PerMethod serial= metodo.createPerMethod();
        return serial;         
    }
    
    public Persistance getPerMethod(){
       return null;
    }
    
    
    
}
