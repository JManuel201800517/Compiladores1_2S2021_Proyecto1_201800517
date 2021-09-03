/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.pkg_.analizador.de.copias;

/**
 *
 * @author Propietario
 */
public class Compare {
    
    public String Direc1;
    public String Direc2;
    
    public Compare(String Direc1, String Direc2){
        this.Direc1 = Direc1;
        this.Direc2 = Direc2;
    }
    
    public String getDireccion1(){
        return Direc1;
    }
    
    public void setDireccion1(String Direc1){
        this.Direc1 = Direc1;
    }
    
    public String getDireccion2(){
        return Direc2;
    }
    
    public void setDireccion2(String Direc2){
        this.Direc2 = Direc2;
    }
    
    
}
