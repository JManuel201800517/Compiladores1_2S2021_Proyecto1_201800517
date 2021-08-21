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
public class Lista {
    public String tipoError;
    public String valorError;
    public String fila;
    public String columna;
    
    public Lista(String tipoError, String valorError, String fila, String columna){
        this.tipoError = tipoError;
        this.valorError = valorError;
        this.fila = fila;
        this.columna = columna;
    }
    
    public String getTipoError(){
        return tipoError;
    }
    
    public void setTipoError(String tipoError){
        this.tipoError = tipoError;
    }
    
    public String getValorError(){
        return valorError;
    }
    
    public void setValorError(String valorError){
        this.valorError = valorError;
    }
    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }
    
}
