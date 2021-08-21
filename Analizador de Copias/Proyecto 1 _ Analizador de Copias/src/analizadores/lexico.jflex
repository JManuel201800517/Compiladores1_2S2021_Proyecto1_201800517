package analizadores;
import java_cup.runtime.*;
import proyecto.pkg1.pkg_.analizador.de.copias.*;
import java.io.PrintStream;
import javax.swing.JTextArea;

%%

%class lexico
%public
%line
%column
%cup
%char
%unicode
%ignorecase


%init{
    yyline = 1;
    yycolumn = 1;
    yychar = 1;
%init}

BLANCOS = [ \r\t]+
ENTEROS=[0-9]+
DECIMALES=[0-9]+("."[ |0-9]+)?
LETRA =[a-zA-ZÑñ]+
ID =({LETRA}|("_"{LETRA}))({LETRA}|{ENTEROS}|"_")*
CADENA =[\"\“\'] [^\"\”\'\n]* [\"\”\'\n]

%{
    public void addLista(String tipo, String lexema, int fila, int columna)
    {
        String filaStr = Integer.toString(fila);
        String columnaStr = Integer.toString(columna);


        Lista nuevoObjeto = new Lista(tipo, lexema, filaStr, columnaStr);
        Interfaz_Grafica.listaString.add(nuevoObjeto);
    }

    public void addError(String tipo, String lexema, int fila, int columna)
    {
        error nuevoerror = new error(tipo, lexema, fila+1, columna+1);
        Interfaz_Grafica.listaErrores.add(nuevoerror);
    }


    public void ImpConsola(){
        Interfaz_Grafica textArea = new Interfaz_Grafica();
        PrintStream printStream = new PrintStream(new Consola(textArea.jTextArea1));
        System.setOut(printStream);
        System.setErr(printStream);
    }
%}

%%

"+" {return new Symbol(sym.MAS, yyline, yycolumn, yytext());}
"-" {return new Symbol(sym.MENOS, yyline, yycolumn, yytext());}
"*" {return new Symbol(sym.POR, yyline, yycolumn, yytext());}
"/" {return new Symbol(sym.DIVIDIDO, yyline, yycolumn, yytext());}

"(" {return new Symbol(sym.PAR1,yycolumn,yyline,yytext());}
")" {return new Symbol(sym.PAR2,yycolumn,yyline,yytext());}

"<" {return new Symbol(sym.MENOR,yycolumn,yyline,yytext());}
">" {return new Symbol(sym.MAYOR,yycolumn,yyline,yytext());}
"=" {return new Symbol(sym.IGUAL,yycolumn,yyline,yytext());}
"!" {return new Symbol(sym.NOT,yycolumn,yyline,yytext());}

";" {return new Symbol(sym.PUNTOYCOMA,yycolumn,yyline,yytext());}

"{" {return new Symbol(sym.LLAVE1,yycolumn,yyline,yytext());}
"}" {return new Symbol(sym.LLAVE2,yycolumn,yyline,yytext());}

"," {return new Symbol(sym.COMA,yycolumn,yyline,yytext());}

"number" {return new Symbol(sym.PR_NUMBER,yyline,yychar, yytext());} 
"boolean" {return new Symbol(sym.PR_BOOLEAN,yyline,yychar, yytext());} 
"string" {return new Symbol(sym.PR_STRING,yyline,yychar, yytext());} 
"double" {return new Symbol(sym.PR_DOUBLE,yyline,yychar, yytext());}

"if" {return new Symbol(sym.PR_IF,yyline,yychar, yytext());} 
"else" {return new Symbol(sym.PR_ELSE,yyline,yychar, yytext());} 
"for" {return new Symbol(sym.PR_FOR,yyline,yychar, yytext());} 
"while" {return new Symbol(sym.PR_WHILE,yyline,yychar, yytext());} 
"func" {return new Symbol(sym.PR_FUNC,yyline,yychar, yytext());} 

\n  {yycolumn=1;}

{BLANCOS} {}
{ENTEROS} {return new Symbol(sym.ENTERO,yyline, (int) yycolumn, yytext());}
{DECIMALES} {return new Symbol(sym.DECIMAL,yyline, (int) yycolumn, yytext());}
{CADENA} {return new Symbol(sym.CADENA,yyline,yycolumn, yytext());} 
{ID} {return new Symbol(sym.IDENTIFICADOR,yycolumn,yyline,yytext());}


. {  
   System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yycolumn);
   addError("Este es un error lexico: ", yytext(), yyline, yycolumn);
   addLista("Este es un error lexico: ", yytext(), yyline, yycolumn);
}


