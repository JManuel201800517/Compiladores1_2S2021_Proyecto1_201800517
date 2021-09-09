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
public class Elemento {
    
    public String Identificador;
    public String Valor;
    
    public Elemento(String Identificador, String Valor){
        this.Identificador = Identificador;
        this.Valor = Valor;
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
    
}
