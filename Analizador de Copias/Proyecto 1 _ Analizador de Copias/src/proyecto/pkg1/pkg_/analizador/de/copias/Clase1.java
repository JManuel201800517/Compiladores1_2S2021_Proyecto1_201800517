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
public class Clase1 {
    public String Nombre;
    public String Lineas;
    public ArrayList<Metodo1> Metodos;
    
    public Clase1(String Nombre, String Lineas, ArrayList<Metodo1> Metodos){
        this.Nombre = Nombre;
        this.Lineas = Lineas;
        this.Metodos = Metodos;
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
    
    public ArrayList<Metodo1> getMetodos1(){
        return Metodos;
    }
    
    public void setMetodos1(ArrayList<Metodo1> Metodos){
        this.Metodos = Metodos;
    }
    
}
