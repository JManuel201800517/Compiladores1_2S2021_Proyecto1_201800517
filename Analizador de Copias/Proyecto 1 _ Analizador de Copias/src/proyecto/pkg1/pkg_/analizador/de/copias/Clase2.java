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
public class Clase2 {
    
    public String Nombre;
    public String Lineas;
    public ArrayList<Metodo2> Metodos;
    
    public Clase2(String Nombre, String Lineas, ArrayList<Metodo2> Metodos){
        this.Nombre = Nombre;
        this.Lineas = Lineas;
        this.Metodos = Metodos;
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
    
    public ArrayList<Metodo2> getMetodos2(){
        return Metodos;
    }
    
    public void setMetodos2(ArrayList<Metodo2> Metodos){
        this.Metodos = Metodos;
    }
    
}
