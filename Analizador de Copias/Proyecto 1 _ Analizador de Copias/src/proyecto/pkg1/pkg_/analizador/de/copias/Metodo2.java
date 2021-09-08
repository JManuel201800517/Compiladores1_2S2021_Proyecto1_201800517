/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.pkg_.analizador.de.copias;

import java.util.ArrayList;

/**
 *
 * @author Propietario
 */
public class Metodo2 {
    
    public String Nombre;
    public String Lineas;
    public ArrayList<Parametro2> Parametro;
    
    public Metodo2(String Nombre, String Lineas, ArrayList<Parametro2> Parametro){
        this.Nombre = Nombre;
        this.Lineas = Lineas;
        this.Parametro = Parametro;
    }
    
    public String getNombre2(){
        return Nombre;
    }
    
    public void setNombre2(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getLineas2(){
        return Lineas;
    }
    
    public void setLineas2(String Lineas){
        this.Lineas = Lineas;
    }
    
    public ArrayList<Parametro2> getParametro2(){
        return Parametro;
    }
    
    public void setLineas2(ArrayList<Parametro2> Parametro){
        this.Parametro = Parametro;
    }
}
