/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.pkg_.analizador.de.copias;

import analizadores.*;
import analizadores2.*;
import analizadores3.*;
import analizadores4.*;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Propietario
 */
public class Interfaz_Grafica extends javax.swing.JFrame {
    
    public static ArrayList<error> listalexicos = new ArrayList<error>();
    
    public static List<Lista> listaString = new ArrayList<>();
    
    public static ArrayList<Puntaje> punt = new ArrayList<Puntaje>();
    
    public static ArrayList<Compare> Comparacion = new ArrayList<Compare>();
    
    public static ArrayList<Variable1> var1 = new ArrayList<Variable1>();
    
    public static ArrayList<Variable1> var2 = new ArrayList<Variable1>();
    
    public static ArrayList<Comentario1> coment1 = new ArrayList<Comentario1>();
    
    public static ArrayList<Comentario1> coment2 = new ArrayList<Comentario1>();
    
    public static ArrayList<Parametro1> para1 = new ArrayList<Parametro1>();
    
    public static ArrayList<Parametro1> para2 = new ArrayList<Parametro1>();
    
    public static ArrayList<Metodo1> meto1 = new ArrayList<Metodo1>();
    
    public static ArrayList<Metodo1> meto2 = new ArrayList<Metodo1>();
    
    public static ArrayList<Clase1> clas1 = new ArrayList<Clase1>();
    
    public static ArrayList<Clase1> clas2 = new ArrayList<Clase1>();
    
    public static ArrayList<Elemento> puntaje = new ArrayList<Elemento>();
    
    public static ArrayList<Elemento> datos = new ArrayList<Elemento>();
    
    public static ArrayList<Titulo> BarraTitulo = new ArrayList<Titulo>();
    
    public static ArrayList<Valor> BarraValor = new ArrayList<Valor>();
    
    public static ArrayList<Titulo> PieTitulo = new ArrayList<Titulo>();
    
    public static ArrayList<Valor> PieValor = new ArrayList<Valor>();
    
    public static ArrayList<Barras> barra = new ArrayList<Barras>();
    
    public static ArrayList<Lineas> linea = new ArrayList<Lineas>();
    
    public static ArrayList<Pastel> pie = new ArrayList<Pastel>();
    
    private PrintStream standardOut;
    
    int n=2;
    
    int Y=0;
    
    String dic1, dic1r = "";
    String dic2, dic2r = "";
    
    
    public static Double RepiVar = 0.0;
    public static Double RepiComent = 0.0;
    public static Double RepiMetoNombre, RepiMetoLinea, RepiMetoPara, RepiMeto = 0.0;
    public static Double RepiClasNombre, RepiClasLinea, RepiClasMeto, RepiClas = 0.0;
    
    public static Double SVar = 0.0;
    public static Double SComent = 0.0;
    public static Double SMeto = 0.0;
    public static Double SClas = 0.0;
    
    public static Double PGeneral = 0.0;
    
    
    private JTable tabla = null;
    DefaultTableModel modelo = null;
    JScrollPane desplazamiento = null;

    /**
     * Creates new form Interfaz_Grafica
     */
    public Interfaz_Grafica() {
        initComponents();
        
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        
        PrintStream printStream = new PrintStream(new Consola(jTextArea1));
        System.setOut(printStream);
        System.setErr(printStream);
        
        

        PrintStream standardOut = System.out;
        PrintStream standardErr = System.err;
        
        //for (int i = 0; i < listaString.size(); i++) {
            //System.out.println(" ");
          //  System.out.println("Este es un error lexico: "+listaString.get(i).getValorError()+", en la linea: "+listaString.get(i).getFila()+", en la columna: "+listaString.get(i).getColumna());
          //  System.out.println(" ");
        //}
        
        //System.out.println("Hola");
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();
        textArea3 = new java.awt.TextArea();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        textArea4 = new java.awt.TextArea();
        textArea5 = new java.awt.TextArea();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIUSAC Analizador de Copias");

        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pestaña 1", jPanel1);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Consola");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setText("Editor");

        jButton1.setText("Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Pestaña");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar Pestaña");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ejecutar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reportes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Abrir Archivo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Guardar Como");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Analisis Inicial");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Analisis de Comparacion");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reporte de Errores");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Reporte Estadistico");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Reporte de Tokens");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Reporte JSON");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre del Archivo");

        jButton15.setText("Analisis de Reportes");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setText("Archivo2");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setText("Archivo1");

        jButton16.setText("Resumen");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Grafica de Barras");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Grafica de Pie");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Datos Finales");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Aceptar 1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Aceptar 2");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton6)
                                        .addComponent(jButton7)
                                        .addComponent(jButton8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(42, 42, 42))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton10)
                                    .addComponent(jButton9)
                                    .addComponent(jButton15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton5)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton14)
                                .addComponent(jButton13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton20)
                            .addComponent(jButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton16)
                                    .addGap(19, 19, 19))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton17)
                                    .addContainerGap()))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18)
                                    .addComponent(jButton19))
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton15)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textArea5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textArea2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textArea3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21)
                                .addGap(34, 34, 34))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar() //Guardar el TextArea
    {
        try {
            //JFileChooser archivo = new JFileChooser(System.getProperty("user.dic"));
            //archivo.showSaveDialog(this);
            //if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter("C:\\Users\\Propietario\\Downloads\\"+ jLabel3.getText())) {
                    guardado.write(textArea1.getText());
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                }
            //}
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }
    
    private void Leer() {
        String aux = "";
        String texto = "";
        String resultado = "";
        String extension = "txt";
        try {
            JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
            
            FileNameExtensionFilter Filter = new FileNameExtensionFilter("fca files (*.fca)", "fca");
        // add filters
            file.addChoosableFileFilter(Filter);
            file.setFileFilter(Filter);
            file.showOpenDialog(this);
            
            jLabel3.setText(file.getSelectedFile().getName());
            System.out.println(file.getSelectedFile().getName());
            
            
            File archivo = file.getSelectedFile();
            
            if (archivo != null) {
                FileReader archivos = new FileReader(archivo);
                BufferedReader leer = new BufferedReader(archivos);
                while ((aux = leer.readLine()) != null) {
                    texto += aux + "\n";
                }
                leer.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }
        textArea1.setText(texto);
    }
    
     private void Exportar() {
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dic"));
            
            archivo.showSaveDialog(this);
            
            jLabel3.setText(archivo.getSelectedFile().getName());
            System.out.println(archivo.getSelectedFile().getName());
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    guardado.write(textArea1.getText());
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                    
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(true);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton15.setVisible(false);
        jButton14.setVisible(true);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        
        
        
        TextArea ta = new TextArea(200,200);
        
        jTabbedPane1.add("Pestaña"+n, ta);
        n = n+1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
        jButton19.setVisible(false);
        
        int t;
        
        t=n-1;
        n = n-1;
        jTabbedPane1.remove(t-1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Leer();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Exportar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Guardar();
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    public void LeerArchivo1() {
        String aux = "";
        String texto = "";
        String resultado = "";
        String extension = "txt";
        try {
            JFileChooser file = new JFileChooser(System.getProperty("user.dir"));

            //FileNameExtensionFilter Filter = new FileNameExtensionFilter("js files (*.fca)", "fca");
            // add filters
            //file.addChoosableFileFilter(Filter);
            //file.setFileFilter(Filter);
            file.showOpenDialog(this);
            //jLabel3.setText(file.getSelectedFile().getName());
            //System.out.println(file.getSelectedFile().getName());
            //System.out.println(Comparacion.get(Y).getDireccion1());
            File archivo = file.getSelectedFile();

            if (archivo != null) {
                FileReader archivos = new FileReader(archivo);
                BufferedReader leer = new BufferedReader(archivos);
                while ((aux = leer.readLine()) != null) {
                    texto += aux + "\n";
                }
                leer.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }
        textArea2.setText(texto);
    
    }
    
    public void LeerArchivo2(){
        String aux = "";
        String texto = "";
        String resultado = "";
        String extension = "txt";
        
        try {
            JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
            
            //FileNameExtensionFilter Filter = new FileNameExtensionFilter("js files (*.fca)", "fca");
        // add filters
            //file.addChoosableFileFilter(Filter);
            //file.setFileFilter(Filter);
            file.showOpenDialog(this);
            
            //jLabel3.setText(file.getSelectedFile().getName());
            //System.out.println(file.getSelectedFile().getName());
            
            File archivo = file.getSelectedFile();
            
            if (archivo != null) {
                FileReader archivos = new FileReader(archivo);
                BufferedReader leer = new BufferedReader(archivos);
                while ((aux = leer.readLine()) != null) {
                    texto += aux + "\n";
                }
                leer.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }
        textArea3.setText(texto);
    }
    
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
                int large1=0;
                int large2=0;
        try{
             System.out.println("Iniciando Analisis Inicio Lexico"); 
             parser2 sintactico;
             sintactico = new parser2(new lexico2(new StringReader(textArea1.getText())));
             sintactico.parse();  
             System.out.println("Fin Analisis Inicio Sintactico"); 

        
         } catch (Exception e){
        
         }
        
        dic1 = Comparacion.get(Y).getDireccion1();
        dic1r = Comparacion.get(Y).getDireccion1();
        large1 = Comparacion.get(Y).getDireccion1().length();
        dic2 = Comparacion.get(Y).getDireccion2();
        dic2r = Comparacion.get(Y).getDireccion2();
        large2 = Comparacion.get(Y).getDireccion2().length();
        //dic1 = dic1.replaceAll('/', '\\');
        
        System.out.println(dic1);
        System.out.println(dic2);
        System.out.println(Comparacion.get(Y).getDireccion1());
        System.out.println(Comparacion.get(Y).getDireccion2());
        System.out.println("F:\\Universidad\\2do Semestre 2021\\Lenguajes y Compiladores 1\\Ejemplos proyecto 1\\laboratorio-olc1\\ArchivosPruebaOLC1-2S2021\\Proyecto 1\\Pruebas\\Prueba1\\pruebatext.txt");
        System.out.println("F:\\Universidad\\2do Semestre 2021\\Lenguajes y Compiladores 1\\Ejemplos proyecto 1\\laboratorio-olc1\\ArchivosPruebaOLC1-2S2021\\Proyecto 1\\Pruebas\\Prueba1\\ProyectoB\\file.js");
        
        String d = "F:\\Universidad\\2do Semestre 2021\\Lenguajes y Compiladores 1\\Ejemplos proyecto 1\\laboratorio-olc1\\ArchivosPruebaOLC1-2S2021\\Proyecto 1\\Pruebas\\Prueba1\\pruebatext.txt";
        
        System.out.println("------");
        System.out.println(d);
        
        textArea4.setText(Comparacion.get(Y).getDireccion1());
        textArea5.setText(Comparacion.get(Y).getDireccion2());
       //LeerArchivo1();
       //LeerArchivo2();
       Y = Y+1;

        
        
 
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try{
             System.out.println("Iniciando Analisis Comparacion Archivo 1 Lexico"); 
             parser sintactico1;
             sintactico1 = new parser(new lexico(new StringReader(textArea2.getText())));
             sintactico1.parse();  
             System.out.println("Fin Analisis Comparacion Archivo 1 Sintactico"); 
             
             System.out.println("Iniciando Analisis Comparacion Archivo 2 Lexico"); 
             parser4 sintactico2;
             sintactico2 = new parser4(new lexico4(new StringReader(textArea3.getText())));
             sintactico2.parse();  
             System.out.println("Fin Analisis Comparacion Archivo 2 Sintactico"); 

        
         } catch (Exception e){
        
         }
        
        // Variables:
        
        for (int i = 0; i < var1.size(); i++) {
            for (int j = 0; j < var2.size(); j++){
                if(var1.get(i).getVariable1() == var2.get(j).getVariable1()){  
                    RepiVar = RepiVar + 1.0;
                    
                    Elemento ele = new Elemento(var1.get(i).getVariable1(), "1.0");
                    puntaje.add(ele);
                    
                    Puntaje point = new Puntaje(var1.get(i).getVariable1(), "1.0", "Variable", "Archivo1");
                    punt.add(point);
 
                }
            }
        }
        
        
        SVar = Double.valueOf(var1.size()) + Double.valueOf(var2.size());
        
        //Comentarios:
        for (int i = 0; i < coment1.size(); i++) {
            for (int j = 0; j < coment2.size(); j++){
                if(coment1.get(i).getComentario1() == coment2.get(j).getComentario1()){  
                    RepiComent = RepiComent + 1.0;  
                    
                    Elemento ele = new Elemento(coment1.get(i).getComentario1(), "1.0");
                    puntaje.add(ele);
                    Puntaje point = new Puntaje(coment1.get(i).getComentario1(), "1.0", "Comentario", "Archivo1");
                    punt.add(point);
                }
            }
        }
        
        SComent = Double.valueOf(coment1.size()) + Double.valueOf(coment2.size());
        
        // Metodos:
        
        for (int i = 0; i < meto1.size(); i++) {
            for (int j = 0; j < meto2.size(); j++){
                if(meto1.get(i).getNombre1() == meto2.get(j).getNombre1()){  
                    RepiMetoNombre = RepiMetoNombre + 0.4;   
                    
                    Elemento ele = new Elemento(meto1.get(i).getNombre1(), "0.4");
                    puntaje.add(ele);
                    Puntaje point = new Puntaje(meto1.get(i).getNombre1(), "0.4", "Metodo", "Archivo1");
                    punt.add(point);
                }
            }
        }
        
        for (int i = 0; i < meto1.size(); i++) {
            for (int j = 0; j < meto2.size(); j++){
                if(meto1.get(i).getLineas1() == meto2.get(j).getLineas1()){  
                    RepiMetoLinea = RepiMetoLinea + 0.3;             
                }
            }
        }
        
        for (int i = 0; i < meto1.size(); i++) {
            for (int j = 0; j < meto2.size(); j++){
                if(meto1.get(i).getParametro1().size() == meto2.get(j).getParametro1().size()){  
                    RepiMetoPara = RepiMetoPara + 0.3;             
                }
            }
        }
        
        RepiMeto = RepiMetoNombre + RepiMetoLinea + RepiMetoPara;
        
        SMeto = Double.valueOf(meto1.size()) + Double.valueOf(meto2.size());
        
        // Clases
        for (int i = 0; i < clas1.size(); i++) {
            for (int j = 0; j < clas2.size(); j++){
                if(clas1.get(i).getNombre1() == clas2.get(j).getNombre1()){  
                    RepiClasNombre = RepiClasNombre + 0.2; 
                    
                    Elemento ele = new Elemento(clas1.get(i).getNombre1(), "0.2");
                    puntaje.add(ele);
                    Puntaje point = new Puntaje(clas1.get(i).getNombre1(), "0.2", "Clase", "Archivo1");
                    punt.add(point);
                    
                    for (int r = 0; r < meto1.size(); r++) {
                        for (int d = 0; d < meto2.size(); d++) {
                            if (clas1.get(i).getMetodos1().get(r).getNombre1() == clas2.get(j).getMetodos1().get(d).getNombre1()) {
                                RepiClasMeto = RepiClasMeto + 0.4;
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < clas1.size(); i++) {
            for (int j = 0; j < clas2.size(); j++){
                if(clas1.get(i).getLineas1() == clas2.get(j).getLineas1()){  
                    RepiClasLinea = RepiClasLinea + 0.4;             
                }
            }
        }
        
        RepiClas = RepiClasNombre + RepiClasLinea + RepiClasMeto;
        
        SClas = Double.valueOf(clas1.size()) + Double.valueOf(clas2.size());
        
        // Puntaje General
        
        PGeneral = ((RepiComent / SComent) * 0.2) + ((RepiVar / SVar) * 0.2) + ((RepiMeto / SMeto) * 0.3) + ((RepiClas / SClas) * 0.3);
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        try{
             System.out.println("Iniciando Analisis Reportes Lexico"); 
             parser3 sintactico;
             sintactico = new parser3(new lexico3(new StringReader(textArea1.getText())));
             sintactico.parse();  
             System.out.println("Fin Analisis Reportes Sintactico"); 

        
         } catch (Exception e){
        
         }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        jButton16.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
        jButton19.setVisible(true);
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
       /* DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        double poblacion = 25;
        int esperanza_de_vida = 5;
        double defunciones;
        double poblacion_neta;

        double tc = 0.2; // tasa de crecimiento 20%
        double tm = 0.4; // tasa de mortalidad 40%

        for (int tiempo = 0; tiempo < esperanza_de_vida; tiempo++) {

            //Crecimiento
            poblacion = poblacion * (1 + tc);
            dataset.addValue(poblacion, "Crecimiento", "" + tiempo);

            //Mortalidad
            defunciones = poblacion * tm;
            dataset.addValue(defunciones, "Mortalidad", "" + tiempo);

            //Crecimiento Neto
            poblacion_neta = poblacion - defunciones;
            dataset.addValue(poblacion_neta, "Crecimiento neto", "" + tiempo);

        }

        JFreeChart chart = ChartFactory.createLineChart(
                "Calculo demografico",
                "Tiempo",
                "Población",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        //Mostramos la grafica en pantalla
        ChartFrame fr = new ChartFrame("Grafica De Lineas", chart);
        fr.pack();
        fr.setVisible(true); */
       
             DefaultCategoryDataset dataset = new DefaultCategoryDataset();


            //Clases

            dataset.addValue(RepiClas, linea.get(0).getDocumento(), " Clase");

            //Metodos/Funciones

            dataset.addValue(RepiMeto, linea.get(0).getDocumento(), " Metodo/Funcion" );

            //Variables

            dataset.addValue(RepiVar, linea.get(0).getDocumento(), " Variables" );
            
            //Comentarios
            dataset.addValue(RepiComent, linea.get(0).getDocumento(), " Comentarios" );

   

        JFreeChart chart = ChartFactory.createLineChart(
                linea.get(0).getNombre(),
                "Valor",
                "Variables",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        //Mostramos la grafica en pantalla
        ChartFrame fr = new ChartFrame("Grafica De Lineas", chart);
        fr.pack();
        fr.setVisible(true);
        
        
        TablaResumen();
    }//GEN-LAST:event_jButton16ActionPerformed

    public void TablaResumen(){
        String[] columnas = {"Tipo", "Proyecto A", "Proyecto B"};
        JFrame tab = new JFrame();
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);       

        // Parametros de la ventana
        tab.setTitle("Tabla de Resumen");
        //tab.setDefaultCloseOperation(tab.EXIT_ON_CLOSE);
        tab.setLayout(new BorderLayout());
        tab.setVisible(true);

        // Modelo de la tabla
        modelo.setColumnIdentifiers(columnas);

        // Barras de desplazamiento
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Propiedades de la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);

        tabla.setModel(modelo);

        // Agregamos datos
        this.agregarDatos(modelo);
        
        
        // Agregando elementos a la ventana
        tab.getContentPane().add(desplazamiento, BorderLayout.NORTH);
        tab.pack();
    }
    
    private void agregarDatos(DefaultTableModel modelo) {
        // Borramos todas las filas en la tabla
        modelo.setRowCount(0);
        
        // Creamos los datos de una fila de la tabla
        Object[] datosFila = {"Tipo", "Proyecto A", "Proyecto B"};
        
        // agregamos esos datos
        modelo.addRow(datosFila);
        
        // Agregamos MUCHOS mas datos
            datosFila[0] = "Total Variables";
            datosFila[1] =  var1.size();
            datosFila[2] =  var2.size();
            
            modelo.addRow(datosFila);
            
            datosFila[0] = "Total Clases";
            datosFila[1] =  clas1.size();
            datosFila[2] =  clas2.size();
            
            modelo.addRow(datosFila);
            
            datosFila[0] = "Total Metodo/Funciones";
            datosFila[1] =  meto1.size();
            datosFila[2] =  meto2.size();
            
            modelo.addRow(datosFila);
            
            datosFila[0] = "Total Comentarios";
            datosFila[1] =  coment1.size();
            datosFila[2] =  coment2.size();
            
            modelo.addRow(datosFila);

    }
    
    
    
    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
        /*DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.setValue(6, "2013", "Jordi");
        dataset.setValue(7, "2014", "Jordi");
        
        dataset.setValue(8, "2013", "Cristina");
        dataset.setValue(5, "2014", "Cristina");
        
        dataset.setValue(12, "2013", "Pedro");
        dataset.setValue(9, "2014", "Pedro");
        
        JFreeChart chart = ChartFactory.createBarChart(
                "Comparación Ventas 2013-2014",
                "Vendedores", 
                "Ventas", 
                dataset, 
                PlotOrientation.HORIZONTAL,
                true, 
                false, 
                false
        );
        
        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Grafica De Barras", chart);
        frame.pack();
        frame.setVisible(true);
        
        TablaResumen();*/
       
        //Grafica Barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        for(int i = 0; i < BarraTitulo.size(); i++){
            
            dataset.setValue(Double.parseDouble(BarraValor.get(i).getValor()), "", BarraTitulo.get(i).getTitulo());
        
        }
        
        JFreeChart chart = ChartFactory.createBarChart(
                barra.get(0).getNombre1(),
                barra.get(0).getTituloY(), 
                barra.get(0).getTituloX(), 
                dataset, 
                PlotOrientation.HORIZONTAL,
                true, 
                false, 
                false
        );
        
        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Grafica De Barras", chart);
        frame.pack();
        frame.setVisible(true);
        

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
       /* DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        pieDataset.setValue("PSOE", new Integer(31));
        pieDataset.setValue("PP", new Integer(34));
        pieDataset.setValue("PODEMOS", new Integer(25));
        pieDataset.setValue("IU", new Integer(8));
        pieDataset.setValue("Otros", new Integer(3));
        
        JFreeChart chart = ChartFactory.createPieChart(
                "Elecciones Generales",
                pieDataset,
                true,
                true,
                false
        );

        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Grafica De Pie", chart);
        frame.pack();
        frame.setVisible(true);*/
       
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        for(int i = 0; i < PieTitulo.size(); i++){
            
             pieDataset.setValue(PieTitulo.get(i).getTitulo(), new Double(Double.parseDouble(PieValor.get(i).getValor())));
        
        }
        
        JFreeChart chart = ChartFactory.createPieChart(
                pie.get(0).getNombre1(),
                pieDataset,
                true,
                true,
                false
        );

        //Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Grafica De Pie", chart);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String[] columnas = {"Nombre", "Carnet", "Fecha y Hora"};
        JFrame tab = new JFrame();
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);       

        // Parametros de la ventana
        tab.setTitle("Datos Finales");
        //tab.setDefaultCloseOperation(tab.EXIT_ON_CLOSE);
        tab.setLayout(new BorderLayout());
        tab.setVisible(true);

        // Modelo de la tabla
        modelo.setColumnIdentifiers(columnas);

        // Barras de desplazamiento
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Propiedades de la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);

        tabla.setModel(modelo);

        // Agregamos datos
        this.agregarDatosFinales(modelo);
        
        
        // Agregando elementos a la ventana
        tab.getContentPane().add(desplazamiento, BorderLayout.NORTH);
        tab.pack();
    }//GEN-LAST:event_jButton19ActionPerformed

        private void agregarDatosFinales(DefaultTableModel modelo) {
        // Borramos todas las filas en la tabla
        modelo.setRowCount(0);
        String tt = "";
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        tt = dtf.format(LocalDateTime.now());
        
        // Creamos los datos de una fila de la tabla
        Object[] datosFila = {"José Manuel Solis Ortiz", "201800517", tt};
        
        // agregamos esos datos
        modelo.addRow(datosFila);

    }
        
    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        LeerArchivo1();
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        LeerArchivo2();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
                String[] columnas = {"Lexema", "Tipo", "Linea", "Columna", "Archivo"};
        JFrame tab = new JFrame();
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);       

        // Parametros de la ventana
        tab.setTitle("Reporte de Errores");
        //tab.setDefaultCloseOperation(tab.EXIT_ON_CLOSE);
        tab.setLayout(new BorderLayout());
        tab.setVisible(true);

        // Modelo de la tabla
        modelo.setColumnIdentifiers(columnas);

        // Barras de desplazamiento
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Propiedades de la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);

        tabla.setModel(modelo);

        // Agregamos datos
        this.agregarDatosErrores(modelo);
        
        
        // Agregando elementos a la ventana
        tab.getContentPane().add(desplazamiento, BorderLayout.NORTH);
        tab.pack();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
                        String[] columnas = {"Lexema", "Token", "Linea", "Columna", "Archivo"};
        JFrame tab = new JFrame();
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);       

        // Parametros de la ventana
        tab.setTitle("Reporte de Tokens");
        //tab.setDefaultCloseOperation(tab.EXIT_ON_CLOSE);
        tab.setLayout(new BorderLayout());
        tab.setVisible(true);

        // Modelo de la tabla
        modelo.setColumnIdentifiers(columnas);

        // Barras de desplazamiento
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Propiedades de la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);

        tabla.setModel(modelo);

        // Agregamos datos
        this.agregarDatosTokens(modelo);
        
        
        // Agregando elementos a la ventana
        tab.getContentPane().add(desplazamiento, BorderLayout.NORTH);
        tab.pack();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        JSONObject obj = new JSONObject();
		obj.put("PuntajeGeneral", PGeneral);
		
		JSONObject innerObj = new JSONObject();
                
                for(int i=0; i < punt.size(); i++){
                    innerObj.put("Nombre", punt.get(i).Identificador);
		    innerObj.put("Puntaje", punt.get(i).Valor);
		    innerObj.put("Tipo", punt.get(i).Tipo);
                    innerObj.put("Archivo", punt.get(i).Docu);
                    
                    obj.put("PuntajesEspecificos",innerObj);
                
                }
		
		

		try {

			FileWriter file = new FileWriter("Descargas");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			//manejar error
		}

		System.out.print(obj);
    }//GEN-LAST:event_jButton14ActionPerformed

    
      private void agregarDatosErrores(DefaultTableModel modelo) {
        // Borramos todas las filas en la tabla
        modelo.setRowCount(0);
        
        // Creamos los datos de una fila de la tabla
        Object[] datosFila = {"Lexema", "Tipo", "Linea", "Columna", "Archivo"};
        
        // agregamos esos datos
        modelo.addRow(datosFila);
        
        // Agregamos MUCHOS mas datos
        for(int x=0; x < listalexicos.size(); x++) {
            datosFila[0] = listalexicos.get(x).getValorError();
            datosFila[1] =  listalexicos.get(x).getTipoError();
            datosFila[2] = listalexicos.get(x).getFila();
            datosFila[3] = listalexicos.get(x).getColumna();
            datosFila[4] = listalexicos.get(x).getEntrada();
            
            modelo.addRow(datosFila);
        }
    }
    private void agregarDatosTokens(DefaultTableModel modelo) {
        // Borramos todas las filas en la tabla
        modelo.setRowCount(0);
        
        // Creamos los datos de una fila de la tabla
        Object[] datosFila = {"Lexema", "Tipo", "Linea", "Columna", "Archivo"};
        
        // agregamos esos datos
        modelo.addRow(datosFila);
        
        // Agregamos MUCHOS mas datos
        for(int x=0; x < 500; x++) {
            datosFila[0] = "Datos " + x + ", 0";
            datosFila[1] =  "Datos " + x + ", 1";
            datosFila[2] = "Datos " + x + ", 2";
            datosFila[3] = "Datos " + x + ", 3";
            datosFila[4] = "Datos " + x + ", 3";
            
            modelo.addRow(datosFila);
        }
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Grafica().setVisible(true);
            }
        });
        
        
    }
    
    
private javax.swing.JLabel grafico;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextArea jTextArea1;
    public java.awt.TextArea textArea1;
    public java.awt.TextArea textArea2;
    public java.awt.TextArea textArea3;
    public static java.awt.TextArea textArea4;
    public static java.awt.TextArea textArea5;
    // End of variables declaration//GEN-END:variables





}



