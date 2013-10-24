package Analizadores;
import practica2_matrizn.*;

import java_cup.runtime.Symbol;
import java.util.LinkedList;



%%


numero          =[0-9]+ "."? [0-9]*
letra           =[a-zA-ZÑñ]+
iden            ={letra}({letra}|{numero}|"_")*

%cupsym simbolo
%class scanner
%cup
%unicode
%public
%line
%char
%ignorecase

%{
/* Lista con errores sintacticos */
public LinkedList<Errores> lista=new LinkedList<Errores>();

/* Metodo que es llamado al encontrar un error lexico */
private void ErrorScan(int linea, int columna, String valor){
lista.add( new Errores(linea, columna, "Error lexico en el caracter "+valor) );
}

%}

%%

"="           {return new Symbol(simbolo.igual, yychar,yyline,new String(yytext()));}
","           {return new Symbol(simbolo.coma, yychar,yyline,new String(yytext()));}
".."          {return new Symbol(simbolo.pts, yychar,yyline,new String(yytext()));}
"declarar"    {return new Symbol(simbolo.dec, yychar,yyline,new String(yytext()));}
"entero"      {return new Symbol(simbolo.entero, yychar,yyline,new String(yytext()));}

"+"            {return new Symbol(simbolo.mas, yychar,yyline,new String(yytext()));}
"*"            {return new Symbol(simbolo.por, yychar,yyline,new String(yytext()));}
"("            {return new Symbol(simbolo.pa, yychar,yyline,new String(yytext()));}
")"            {return new Symbol(simbolo.pc, yychar,yyline,new String(yytext()));}

[\[]        {return new Symbol(simbolo.ca, yychar,yyline,new String(yytext()));}
[\]]        {return new Symbol(simbolo.cc, yychar,yyline,new String(yytext()));}

{numero}            {return new Symbol(simbolo.num, yychar,yyline,new String(yytext()));}
{iden}              {return new Symbol(simbolo.id, yychar,yyline,new String(yytext()));}
[ \t\r\f\n]+        { /* Se ignoran */}

.                    { ErrorScan(yyline,yychar,yytext());  }
