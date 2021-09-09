package analizadores;
import java_cup.runtime.Symbol;
import proyecto.pkg1.pkg_.analizador.de.copias.*;

%%

%class lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%init{
    yyline = 1;
    yychar = 1;
%init}

BLANCOS = [ \r\t]+
ENTEROS=[0-9]+
ENTEROS2= ENTEROS
DECIMALES= {ENTEROS} ("."? [0-9]*)?
LETRAS =[a-zA-ZÑñ_-]+
LETRAS2 = LETRAS
COMBINACION =(LETRAS|ENTEROS|DECIMALES)+ 
CADENAS =[\"\“\'] 

CLASS = ("C"|"c")("L"|"l")("A"|"a")("S"|"s")("S"|"s")
VAR = ("V"|"v")("A"|"a")("R"|"r")
LET = ("L"|"l")("E"|"e")("T"|"t")
CONST = ("C"|"c")("O"|"o")("N"|"n")("S"|"s")("T"|"t")
IF = ("I"|"i")("F"|"f")
ELSE = ("E"|"e")("L"|"l")("S"|"s")("E"|"e")
FOR = ("F"|"f")("O"|"o")("R"|"r")
WHILE = ("W"|"w")("H"|"h")("I"|"i")("L"|"l")("E"|"e")
DO = ("D"|"d")("O"|"o")
SWITCH = ("S"|"s")("W"|"w")("I"|"i")("T"|"t")("C"|"c")("H"|"h")
CONSOLE = ("C"|"c")("O"|"o")("N"|"n")("S"|"s")("O"|"o")("L"|"l")("E"|"e")(".")("L"|"l")("O"|"o")("G"|"g")
BREAK = ("B"|"b")("R"|"r")("E"|"e")("A"|"a")("K"|"k")
REQUIRE = ("R"|"r")("E"|"e")("Q"|"q")("U"|"u")("I"|"i")("R"|"r")("E"|"e")
DEFAULT = ("D"|"d")("E"|"e")("F"|"f")("A"|"a")("U"|"u")("L"|"l")("T"|"t")
CASE = ("C"|"c")("A"|"a")("S"|"s")("E"|"e")


%{
    public void addError(String tipo, String lexema, int fila, int columna, String Entrada)
    {
        error nuevoerror = new error(tipo, lexema, fila+1, columna+1, Entrada);
        Interfaz_Grafica.listalexicos.add(nuevoerror);
    }
%}


%%

"+" {return new Symbol(sym.MAS, yyline, (int) yychar, yytext());}
"-" {return new Symbol(sym.MENOS, yyline, (int) yychar, yytext());}
"*" {return new Symbol(sym.POR, yyline, (int) yychar, yytext());}
"/" {return new Symbol(sym.DIVIDIDO, yyline, (int) yychar, yytext());}

"(" {return new Symbol(sym.PAR1, yyline, (int) yychar, yytext());}
")" {return new Symbol(sym.PAR2, yyline, (int) yychar, yytext());}

"<" {return new Symbol(sym.MENOR, yyline, (int) yychar, yytext());}
">" {return new Symbol(sym.MAYOR, yyline, (int) yychar, yytext());}
"=" {return new Symbol(sym.IGUAL, yyline, (int) yychar, yytext());}
"!" {return new Symbol(sym.NOT, yyline, (int) yychar, yytext());}

";" {return new Symbol(sym.PUNTOYCOMA, yyline, (int) yychar, yytext());}
":" {return new Symbol(sym.DOSPUNTOS, yyline, (int) yychar, yytext());}

"{" {return new Symbol(sym.LLAVE1, yyline, (int) yychar, yytext());}
"}" {return new Symbol(sym.LLAVE2, yyline, (int) yychar, yytext());}

"," {return new Symbol(sym.COMA, yyline, (int) yychar, yytext());}
"." {return new Symbol(sym.PUNTO, yyline, (int) yychar, yytext());}

"//" {return new Symbol(sym.COMENTARIOS, yyline, (int) yychar, yytext());}
"/*" {return new Symbol(sym.COMENINICIAL, yyline, (int) yychar, yytext());}
"*/" {return new Symbol(sym.COMENFINAL, yyline, (int) yychar, yytext());}

"'" {return new Symbol(sym.COMILLA, yyline, (int) yychar, yytext());}

"&&" {return new Symbol(sym.AND, yyline, (int) yychar, yytext());}
"||" {return new Symbol(sym.OR, yyline, (int) yychar, yytext());}
"%" {return new Symbol(sym.PORCENTAJE, yyline, (int) yychar, yytext());}

{CLASS} {return new Symbol(sym.CLASS, yyline, (int) yychar, yytext());}

{VAR} {return new Symbol(sym.VAR, yyline, (int) yychar, yytext());}
{LET} {return new Symbol(sym.LET, yyline, (int) yychar, yytext());}
{CONST} {return new Symbol(sym.CONST, yyline, (int) yychar, yytext());}

{IF} {return new Symbol(sym.IF, yyline, (int) yychar, yytext());}
{ELSE} {return new Symbol(sym.ELSE, yyline, (int) yychar, yytext());}

{FOR} {return new Symbol(sym.FOR, yyline, (int) yychar, yytext());}

{WHILE} {return new Symbol(sym.WHILE, yyline, (int) yychar, yytext());}
{DO} {return new Symbol(sym.DO, yyline, (int) yychar, yytext());}

{SWITCH} {return new Symbol(sym.SWITCH, yyline, (int) yychar, yytext());}
{BREAK} {return new Symbol(sym.BREAK, yyline, (int) yychar, yytext());}
{DEFAULT} {return new Symbol(sym.DEFAULT, yyline, (int) yychar, yytext());}
{CASE} {return new Symbol(sym.CASE, yyline, (int) yychar, yytext());}

{CONSOLE} {return new Symbol(sym.CONSOLE, yyline, (int) yychar, yytext());}
{REQUIRE} {return new Symbol(sym.REQUIRE, yyline, (int) yychar, yytext());}

\n  {yychar=1;}

{BLANCOS} {}
{ENTEROS} {return new Symbol(sym.ENTEROS, yyline, (int) yychar, yytext());}
{ENTEROS2} {return new Symbol(sym.ENTEROS2, yyline, (int) yychar, yytext());}
{DECIMALES} {return new Symbol(sym.DECIMALES, yyline, (int) yychar, yytext());}
{LETRAS} {return new Symbol(sym.LETRAS, yyline, (int) yychar, yytext());}
{LETRAS2} {return new Symbol(sym.LETRAS2, yyline, (int) yychar, yytext());}
{COMBINACION} {return new Symbol(sym.COMBINACION, yyline, (int) yychar, yytext());}
{CADENAS} {return new Symbol(sym.CADENAS, yyline, (int) yychar, yytext());}

. {
   System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
    addError("Error Lexico: simbolo no reconocido", yytext(), yyline, yycolumn, Interfaz_Grafica.textArea4.getText());
}

