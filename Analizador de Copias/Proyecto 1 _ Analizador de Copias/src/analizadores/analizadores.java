/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.io.PrintStream;
import javax.swing.JTextArea;
import proyecto.pkg1.pkg_.analizador.de.copias.*;

/**
 *
 * @author Propietario
 */
public class analizadores {
    public static void main(String[] args) {
        
        
        try{
            String ruta = "src/analizadores/";
            String opcFlex[] = {ruta + "lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
