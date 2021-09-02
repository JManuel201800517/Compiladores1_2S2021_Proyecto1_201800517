/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores3;

/**
 *
 * @author Propietario
 */
public class analizadores3 {
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String ruta = "src/analizadores3/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser3", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
