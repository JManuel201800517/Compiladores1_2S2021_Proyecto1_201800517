package analizadores3;
import java_cup.runtime.Symbol;

%%

%class lexico3
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
LETRAS =[a-zA-ZÑñ]+
COMBINACION =[LETRAS|ENTEROS|DECIMALES]+ 
CADENAS =[\"\“\'] 

DEFINIRGLOBALES = ("D"|"d")("E"|"e")("F"|"f")("I"|"i")("N"|"n")("I"|"i")("R"|"r")("G"|"g")("L"|"l")("O"|"o")("B"|"b")("A"|"a")("L"|"l")("E"|"e")("S"|"s")
COMPARE = ("C"|"c")("O"|"o")("M"|"m")("P"|"p")("A"|"a")("R"|"r")("E"|"e")
STRING = ("S"|"s")("T"|"t")("R"|"r")("I"|"i")("N"|"n")("G"|"g")
DOUBLE = ("D"|"d")("O"|"o")("U"|"u")("B"|"b")("L"|"l")("E"|"e")
GRAFICABARRAS = ("G"|"g")("R"|"r")("A"|"a")("F"|"f")("I"|"i")("C"|"c")("A"|"a")("B"|"b")("A"|"a")("R"|"r")("R"|"r")("A"|"a")("S"|"s")
TITULO = ("T"|"t")("I"|"i")("T"|"t")("U"|"u")("L"|"l")("O"|"o")
EJEX = ("E"|"e")("J"|"j")("E"|"e")("X"|"x")
VALORES = ("V"|"v")("A"|"a")("L"|"l")("O"|"o")("R"|"r")("E"|"e")("S"|"s")
TITULOX = ("T"|"t")("I"|"i")("T"|"t")("U"|"u")("L"|"l")("O"|"o")("X"|"x")
TITULOY = ("T"|"t")("I"|"i")("T"|"t")("U"|"u")("L"|"l")("O"|"o")("Y"|"y")
GENERARREPORTEESTADISTICO = ("G"|"g")("E"|"e")("N"|"n")("E"|"e")("R"|"r")("A"|"a")("R"|"r")("R"|"r")("E"|"e")("P"|"p")("O"|"o")("R"|"r")("T"|"t")("E"|"e")("E"|"e")("S"|"s")("T"|"t")("A"|"a")("D"|"d")("I"|"i")("S"|"s")("T"|"t")("I"|"i")("C"|"c")("O"|"o")
GRAFICAPIE = ("G"|"g")("R"|"r")("A"|"a")("F"|"f")("I"|"i")("C"|"c")("A"|"a")("P"|"p")("I"|"i")("E"|"e")
GRAFICALINEAS = ("G"|"g")("R"|"r")("A"|"a")("F"|"f")("I"|"i")("C"|"c")("A"|"a")("L"|"l")("I"|"i")("N"|"n")("E"|"e")("A"|"a")("S"|"s")
ARCHIVO = ("A"|"a")("R"|"r")("C"|"c")("H"|"h")("I"|"i")("V"|"v")("O"|"o")
PUNTAJEESPECIFICO = ("P"|"p")("U"|"u")("N"|"n")("T"|"t")("A"|"a")("J"|"j")("E"|"e")("E"|"e")("S"|"s")("P"|"p")("E"|"e")("C"|"c")("I"|"i")("F"|"f")("I"|"i")("C"|"c")("O"|"o")
PUNTAJEGENERAL = ("P"|"p")("U"|"u")("N"|"n")("T"|"t")("A"|"a")("J"|"j")("E"|"e")("G"|"g")("E"|"e")("N"|"n")("E"|"e")("R"|"r")("A"|"a")("L"|"l")


%%

"[" {return new Symbol(sym.CORCHETE1, yyline, (int) yychar, yytext());}
"]" {return new Symbol(sym.CORCHETE2, yyline, (int) yychar, yytext());}

"(" {return new Symbol(sym.PAR1, yyline, (int) yychar, yytext());}
")" {return new Symbol(sym.PAR2, yyline, (int) yychar, yytext());}

"=" {return new Symbol(sym.IGUAL, yyline, (int) yychar, yytext());}
"C" {return new Symbol(sym.CDM, yyline, (int) yychar, yytext());}
"/" {return new Symbol(sym.DIVIDIDO, yyline, (int) yychar, yytext());}

";" {return new Symbol(sym.PUNTOYCOMA, yyline, (int) yychar, yytext());}
":" {return new Symbol(sym.DOSPUNTOS, yyline, (int) yychar, yytext());}

"{" {return new Symbol(sym.LLAVE1, yyline, (int) yychar, yytext());}
"}" {return new Symbol(sym.LLAVE2, yyline, (int) yychar, yytext());}

"," {return new Symbol(sym.COMA, yyline, (int) yychar, yytext());}

"##" {return new Symbol(sym.COMENTARIOS, yyline, (int) yychar, yytext());}
"#*" {return new Symbol(sym.COMENINICIAL, yyline, (int) yychar, yytext());}
"*#" {return new Symbol(sym.COMENFINAL, yyline, (int) yychar, yytext());}

"'" {return new Symbol(sym.COMILLA, yyline, (int) yychar, yytext());}
"$" {return new Symbol(sym.MONEDA, yyline, (int) yychar, yytext());}


{DEFINIRGLOBALES} {return new Symbol(sym.DEFINIRGLOBALES, yyline, (int) yychar, yytext());}

{COMPARE} {return new Symbol(sym.COMPARE, yyline, (int) yychar, yytext());}
{STRING} {return new Symbol(sym.STRING, yyline, (int) yychar, yytext());}
{DOUBLE} {return new Symbol(sym.DOUBLE, yyline, (int) yychar, yytext());}

{GRAFICABARRAS} {return new Symbol(sym.GRAFICABARRAS, yyline, (int) yychar, yytext());}
{TITULO} {return new Symbol(sym.TITULO, yyline, (int) yychar, yytext());}

{EJEX} {return new Symbol(sym.EJEX, yyline, (int) yychar, yytext());}

{VALORES} {return new Symbol(sym.VALORES, yyline, (int) yychar, yytext());}
{TITULOX} {return new Symbol(sym.TITULOX, yyline, (int) yychar, yytext());}

{TITULOY} {return new Symbol(sym.TITULOY, yyline, (int) yychar, yytext());}
{GENERARREPORTEESTADISTICO} {return new Symbol(sym.GENERARREPORTEESTADISTICO, yyline, (int) yychar, yytext());}
{GRAFICAPIE} {return new Symbol(sym.GRAFICAPIE, yyline, (int) yychar, yytext());}
{GRAFICALINEAS} {return new Symbol(sym.GRAFICALINEAS, yyline, (int) yychar, yytext());}

{ARCHIVO} {return new Symbol(sym.ARCHIVO, yyline, (int) yychar, yytext());}
{PUNTAJEESPECIFICO} {return new Symbol(sym.PUNTAJEESPECIFICO, yyline, (int) yychar, yytext());}
{PUNTAJEGENERAL} {return new Symbol(sym.PUNTAJEGENERAL, yyline, (int) yychar, yytext());}


\n  {yychar=1;}

{BLANCOS} {}
{ENTEROS} {return new Symbol(sym.ENTEROS, yyline, (int) yychar, yytext());}
{ENTEROS2} {return new Symbol(sym.OTROENTERO, yyline, (int) yychar, yytext());}
{DECIMALES} {return new Symbol(sym.DECIMALES, yyline, (int) yychar, yytext());}
{LETRAS} {return new Symbol(sym.LETRAS, yyline, (int) yychar, yytext());}
{COMBINACION} {return new Symbol(sym.COMBINACION, yyline, (int) yychar, yytext());}
{CADENAS} {return new Symbol(sym.CADENAS, yyline, (int) yychar, yytext());}

. {
   System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}

