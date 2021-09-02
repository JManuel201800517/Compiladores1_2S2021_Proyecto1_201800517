/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores4;

/**
 *
 * @author Propietario
 */
public class analizadores4 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        try{
            String ruta = "src/analizadores4/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser4", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
