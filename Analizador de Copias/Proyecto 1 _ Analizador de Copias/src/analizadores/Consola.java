/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import proyecto.pkg1.pkg_.analizador.de.copias.*;
import java.io.IOException;
import java.io.OutputStream;
 
import javax.swing.JTextArea;

/**
 *
 * @author Propietario
 */
public class Consola extends OutputStream {
    private JTextArea jtextArea;
     
    public Consola(JTextArea jtextArea) {
        this.jtextArea = jtextArea;
    }
     
    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        jtextArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        jtextArea.setCaretPosition(jtextArea.getDocument().getLength());
    }
}

    
