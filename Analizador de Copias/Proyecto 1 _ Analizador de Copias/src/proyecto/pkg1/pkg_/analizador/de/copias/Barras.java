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
public class Barras {
    
    public String Nombre;
    public ArrayList<Titulo> EjeX;
    public ArrayList<Valor> Numero;
    public String TituloEjeX;
    public String TituloEjeY;
    
    public Barras(String Nombre, ArrayList<Titulo> EjeX, ArrayList<Valor> Numero, String TituloEjeX, String TituloEjeY){
        this.Nombre = Nombre;
        this.EjeX = EjeX;
        this.Numero = Numero;
        this.TituloEjeX = TituloEjeX;
        this.TituloEjeY = TituloEjeY;
    }
    
    public String getNombre1(){
        return Nombre;
    }
    
    public void setNombre1(String Nombre){
        this.Nombre = Nombre;
    }
    
    public ArrayList<Titulo> getEjeX(){
        return EjeX;
    }
    
    public void setEjeX(ArrayList<Titulo> EjeX){
        this.EjeX = EjeX;
    }
    
    public ArrayList<Valor> getNumero(){
        return Numero;
    }
    
    public void setNumero(ArrayList<Valor> Numero){
        this.Numero = Numero;
    }
    
    public String getTituloX(){
        return TituloEjeX;
    }
    
    public void setTituloX(String TituloEjeX){
        this.TituloEjeX = TituloEjeX;
    }
    
    public String getTituloY(){
        return TituloEjeY;
    }
    
    public void setTituloY(String TituloEjeY){
        this.TituloEjeY = TituloEjeY;
    }
    
    
}
