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
public class Lineas {
        public String Nombre;
        public String Documento;
    
    public Lineas(String Nombre, String Documento){
        this.Nombre = Nombre;
        this.Documento = Documento;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getDocumento(){
        return Documento;
    }
    
    public void setDocumento(String Documento){
        this.Documento = Documento;
    }

    
}
