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
public class Metodo1 {
    public String Nombre;
    public String Lineas;
    public ArrayList<Parametro1> Parametro;
    
    public Metodo1(String Nombre, String Lineas, ArrayList<Parametro1> Parametro){
        this.Nombre = Nombre;
        this.Lineas = Lineas;
        this.Parametro = Parametro;
    }
    
    public String getNombre1(){
        return Nombre;
    }
    
    public void setNombre1(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getLineas1(){
        return Lineas;
    }
    
    public void setLineas1(String Lineas){
        this.Lineas = Lineas;
    }
    
    public ArrayList<Parametro1> getParametro1(){
        return Parametro;
    }
    
    public void setLineas1(ArrayList<Parametro1> Parametro){
        this.Parametro = Parametro;
    }
    
}
