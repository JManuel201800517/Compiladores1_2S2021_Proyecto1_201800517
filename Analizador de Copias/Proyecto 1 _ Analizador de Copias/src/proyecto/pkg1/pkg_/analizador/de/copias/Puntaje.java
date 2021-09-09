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
public class Puntaje {
    
    public String Identificador;
    public String Valor;
    public String Tipo;
    public String Docu;
    
    public Puntaje(String Identificador, String Valor, String Tipo, String Docu ){
        this.Identificador = Identificador;
        this.Valor = Valor;
        this.Tipo = Tipo;
        this.Docu = Docu;
    }
    
    public String getIdentificador(){
        return Identificador;
    }
    
    public void setIdentificador(String Identificador){
        this.Identificador = Identificador;
    }
    
    public String getValor(){
        return Valor;
    }
    
    public void setValor(String Valor){
        this.Valor = Valor;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public String getDocu(){
        return Docu;
    }
    
    public void setDocu(String Docu){
        this.Docu = Docu;
    }
    
}
