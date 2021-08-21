/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.pkg_.analizador.de.copias;

import java.io.StringReader;
import analizadores.*;
//import java_cup.parser;

/**
 *
 * @author Propietario
 */
public class Proyecto1_AnalizadorDeCopias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
             parser sintactico;
             sintactico = new parser(new lexico(new StringReader("2.34*2+3*2+100")));
             sintactico.parse();
        
         } catch (Exception e){
        
         }
    }
    
}
