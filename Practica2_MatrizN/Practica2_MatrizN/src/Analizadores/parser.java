
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Oct 21 00:40:04 CST 2013
//----------------------------------------------------

package Analizadores;

import practica2_matrizn.*;
import java.io.*;
import java.util.LinkedList;
import java_cup.runtime.*;

/** CUP v0.10k generated parser.
  * @version Mon Oct 21 00:40:04 CST 2013
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\004\000\002\003\003\000\002\004" +
    "\004\000\002\004\003\000\002\005\005\000\002\005\006" +
    "\000\002\005\004\000\002\006\005\000\002\006\007\000" +
    "\002\006\005\000\002\006\011\000\002\006\007\000\002" +
    "\010\003\000\002\007\005\000\002\007\005\000\002\007" +
    "\005\000\002\007\003\000\002\007\003\000\002\007\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\006\015\011\020\010\001\002\000\004\002" +
    "\050\001\002\000\006\011\045\014\035\001\002\000\010" +
    "\002\ufffe\015\ufffe\020\ufffe\001\002\000\010\002\000\015" +
    "\011\020\010\001\002\000\006\010\023\012\042\001\002" +
    "\000\004\016\012\001\002\000\004\020\ufff5\001\002\000" +
    "\004\020\014\001\002\000\004\010\015\001\002\000\012" +
    "\006\020\015\011\017\017\020\022\001\002\000\006\011" +
    "\036\014\035\001\002\000\024\002\ufff1\004\ufff1\005\ufff1" +
    "\007\ufff1\011\ufff1\013\ufff1\014\ufff1\015\ufff1\020\ufff1\001" +
    "\002\000\012\006\020\015\011\017\017\020\022\001\002" +
    "\000\014\004\026\005\025\011\ufff6\013\031\014\ufff6\001" +
    "\002\000\026\002\ufff0\004\ufff0\005\ufff0\007\ufff0\010\023" +
    "\011\ufff0\013\ufff0\014\ufff0\015\ufff0\020\ufff0\001\002\000" +
    "\012\006\020\015\011\017\017\020\022\001\002\000\012" +
    "\004\026\005\025\011\ufff8\014\ufff8\001\002\000\012\006" +
    "\020\015\011\017\017\020\022\001\002\000\012\006\020" +
    "\015\011\017\017\020\022\001\002\000\024\002\ufff4\004" +
    "\ufff4\005\025\007\ufff4\011\ufff4\013\ufff4\014\ufff4\015\ufff4" +
    "\020\ufff4\001\002\000\024\002\ufff3\004\ufff3\005\ufff3\007" +
    "\ufff3\011\ufff3\013\ufff3\014\ufff3\015\ufff3\020\ufff3\001\002" +
    "\000\012\006\020\015\011\017\017\020\022\001\002\000" +
    "\012\004\026\005\025\011\ufff7\014\ufff7\001\002\000\010" +
    "\004\026\005\025\007\034\001\002\000\024\002\ufff2\004" +
    "\ufff2\005\ufff2\007\ufff2\011\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\020\ufff2\001\002\000\012\006\020\015\011\017\017\020" +
    "\022\001\002\000\024\002\uffef\004\uffef\005\uffef\007\uffef" +
    "\011\uffef\013\uffef\014\uffef\015\uffef\020\uffef\001\002\000" +
    "\014\004\026\005\025\011\ufffa\013\040\014\ufffa\001\002" +
    "\000\012\006\020\015\011\017\017\020\022\001\002\000" +
    "\012\004\026\005\025\011\ufff9\014\ufff9\001\002\000\012" +
    "\006\020\015\011\017\017\020\022\001\002\000\014\002" +
    "\ufffd\004\026\005\025\015\ufffd\020\ufffd\001\002\000\010" +
    "\002\uffff\015\uffff\020\uffff\001\002\000\012\002\ufffb\012" +
    "\046\015\ufffb\020\ufffb\001\002\000\012\006\020\015\011" +
    "\017\017\020\022\001\002\000\014\002\ufffc\004\026\005" +
    "\025\015\ufffc\020\ufffc\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\012\003\003\004\006\005\005\006\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\005\043\006\004\001\001\000\002\001\001\000" +
    "\004\010\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\006\015\007\020\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\015\007\032" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\006" +
    "\015\007\023\001\001\000\002\001\001\000\006\006\015" +
    "\007\027\001\001\000\006\006\015\007\026\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\015\007\031" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\006\015\007\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\006\015\007\040\001\001\000" +
    "\002\001\001\000\006\006\015\007\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\006" +
    "\015\007\046\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public TSimbolos tablaSimbolos =new TSimbolos ();
        public LinkedList<Errores> lista=new LinkedList<Errores>();
        
        public void setTablaSimbolos(TSimbolos tablaSimbolos){
            this.tablaSimbolos=tablaSimbolos;
        }
            /**Metodo al que se llama automaticamente ante algun error sintactico.*/
public void syntax_error(Symbol s){
       lista.add(new Errores(s.right+1,s.left,"Error sintactico Identificador " +s.value + " no reconocido." ));
    }
             /**Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        lista.add(new Errores(s.right+1,s.left,"Error sintactico Identificador " +s.value + " no reconocido." ));
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {



    int cant = 0;

    public static void escribir(String texto){
        
        try {
            FileWriter fw = new FileWriter("Codigo.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salid = new PrintWriter(bw);
            salid.println(texto);
            salid.close();
        }
        catch(java.io.IOException ioex) {
          System.out.println("se presento el error al crear el archivo Graphviz.txt: "+ioex.toString());
        }
    }

    public String genera_tmp(){
        String res = "t"+cant;
        cant++;
        return res;
    }


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // E ::= MAT cc 
            {
              Expresiones RESULT = null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Matriz mt = (Matriz)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  if (mt.tipo != 3){
                        Boolean res = parser.tablaSimbolos.referencia(mt.id, mt.dim) ;
                        if (!res)
                          parser.lista.add(new Errores(mtright+1, mtleft, "Error SEMANTICO: referencia de dimensiones incorrecta" ));

                        String tmp = genera_tmp();
                        escribir (tmp + "=" + mt.id + "[" + mt.cad + "]");
                     }
                      RESULT = new Expresiones(0, mt.cad);
                  
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // E ::= id 
            {
              Expresiones RESULT = null;
		int idsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int idsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String ids = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		  RESULT = new Expresiones(0, ids );
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // E ::= num 
            {
              Expresiones RESULT = null;
		int nmleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int nmright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		String nm = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		  RESULT = new Expresiones(Integer.parseInt(nm), nm);
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E ::= pa E pc 
            {
              Expresiones RESULT = null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		  RESULT = e; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E ::= E por E 
            {
              Expresiones RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresiones e1 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e2 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		    String tmp = genera_tmp();
                           escribir(tmp+ "=" + e1.cad + "*" + e2.cad);
                           RESULT = new Expresiones (e1.val*e2.val, tmp);
                     
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E ::= E mas E 
            {
              Expresiones RESULT = null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresiones e1 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e2 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		    String tmp = genera_tmp();
                           escribir(tmp+ "=" + e1.cad + "+" + e2.cad);
                           RESULT = new Expresiones(e1.val+e2.val, tmp);
                     
              CUP$parser$result = new java_cup.runtime.Symbol(5/*E*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPO ::= entero 
            {
              String RESULT = null;
		 RESULT = "0"; 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*TIPO*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // MAT ::= dec TIPO id ca E 
            {
              Matriz RESULT = null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int idsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String ids = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 TSimbolos datos = new TSimbolos (0, Integer.parseInt(tipo), 0);
               int tp = 0;
               Boolean res = parser.tablaSimbolos.agregar_val(ids, datos);
               if (!res){
                    parser.lista.add(new Errores(idsright+1, idsleft, "Error SEMANTICO: la variable "+ids+" ya fue declarada" ));
                    
                    /* EN ESTE CASO TIPO = 3, seria error*/
                    tp = 3;
               }else
                    parser.tablaSimbolos.nueva_dimension(ids, 1, e.val);
                    
               RESULT = new Matriz(1, tp, ids, "");
            
              CUP$parser$result = new java_cup.runtime.Symbol(4/*MAT*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // MAT ::= dec TIPO id ca E pts E 
            {
              Matriz RESULT = null;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int idsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String ids = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresiones e1 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e2 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 TSimbolos datos = new TSimbolos (0, Integer.parseInt(tipo), 0);
                int tp = 0;
               Boolean res = parser.tablaSimbolos.agregar_val(ids, datos);
               if (!res){
                    parser.lista.add(new Errores(idsright+1, idsleft, "Error SEMANTICO: la variable "+ids+" ya fue declarada" ));
                    tp = 3;
               }else{
                    if (e1.val < e2.val)
                        parser.tablaSimbolos.nueva_dimension(ids, e1.val, e2.val);
                    else 
                        parser.lista.add(new Errores(idsright+1, idsleft, "Error SEMANTICO: limites mal declarados" ));
               }

               RESULT = new Matriz(1, tp, ids, "");
            
              CUP$parser$result = new java_cup.runtime.Symbol(4/*MAT*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // MAT ::= id ca E 
            {
              Matriz RESULT = null;
		int idsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String ids = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		   Boolean res = parser.tablaSimbolos.tabla.containsKey(ids);
                 Matriz mt = new Matriz(1, 1, ids, "");
                 int tp = 1;
                 if (!res){
                      parser.lista.add(new Errores(idsright+1, idsleft, "Error SEMANTICO: la variable "+ids+" no ha sido declarada" ));
                      tp = 3;
                 }else{
                      res = parser.tablaSimbolos.limite_valido(ids, 1, e.val);
                      if (!res)
                        parser.lista.add(new Errores(idsright+1, idsleft, "Error SEMANTICO: el valor "+ e.val + " fuera del limite" ));
                      else{
                        String tmp = genera_tmp();
                        int x = parser.tablaSimbolos.getInf(ids, 1);
                        escribir (tmp + "=" + e.cad + "-" + x);
                        mt.cad = tmp;
                      }
                 }
                 
                 mt.tipo = tp;   
                 RESULT = mt;
            
              CUP$parser$result = new java_cup.runtime.Symbol(4/*MAT*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // MAT ::= MAT coma E pts E 
            {
              Matriz RESULT = null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Matriz mt = (Matriz)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresiones e1 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e2 = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		  if (mt.tipo == 0){
                        if (e1.val < e2.val)
                            parser.tablaSimbolos.nueva_dimension(mt.id, e1.val, e2.val);
                        else
                            parser.lista.add(new Errores(e2right+1, e2left, "Error SEMANTICO: limites mal declarados" ));

                        mt.setDim(mt.dim+1);
                    
                }else if (mt.tipo == 1)
                    parser.lista.add(new Errores(e1right+1, e1left, "Error SEMANTICO: definicion de dimensiones incorrecta " ));
                
                RESULT = mt;
            
              CUP$parser$result = new java_cup.runtime.Symbol(4/*MAT*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // MAT ::= MAT coma E 
            {
              Matriz RESULT = null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Matriz mt = (Matriz)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		   mt.dim = mt.dim +1;
                
                 if (mt.tipo == 0){     //SI ES DECLARACION
                        
                            parser.tablaSimbolos.nueva_dimension(mt.id, 1, e.val);
                            mt.setDim(mt.dim);
                        
                 }else{                 
                    if (mt.tipo == 1) {   //ERROR NO FUE DECLARADA
                        
                        if (mt.dim <= parser.tablaSimbolos.get_NoDim(mt.id)){
                            Boolean res = parser.tablaSimbolos.limite_valido(mt.id, mt.dim, e.val);
                            if (!res)
                                parser.lista.add(new Errores(eright+1, eleft, "Error SEMANTICO: el valor "+ e.val + " fuera del limite" ));
                            else{
                                int m = parser.tablaSimbolos.getInf(mt.id, mt.dim);
                                int z = parser.tablaSimbolos.tamaño_dim(mt.id, mt.dim);

                                String tmp = genera_tmp();
                                escribir (tmp + "=" + mt.cad + "*" + z);

                                String tmp1 = genera_tmp();
                                escribir (tmp1 + "=" + e.cad + "-" + m);

                                String tmp2 = genera_tmp();
                                escribir (tmp2 + "=" + tmp + "+" + tmp1);

                                mt.cad = tmp2;
                          }
                       }
                    }
                 }
                 
                 RESULT = mt;
                       
            
              CUP$parser$result = new java_cup.runtime.Symbol(4/*MAT*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // S ::= MAT cc 
            {
              Object RESULT = null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Matriz mt = (Matriz)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (mt.tipo == 0){
                                    parser.tablaSimbolos.set_NoDim(mt.id, mt.dim);
                                    escribir( mt.id + "[" + parser.tablaSimbolos.tamaño_matriz(mt.id) + "]"); 
                                 }

                                 if (mt.tipo == 1)
                                    parser.lista.add(new Errores(mtright+1, mtleft, "Error SEMANTICO: definir un valor para asignar" ));
                             
              CUP$parser$result = new java_cup.runtime.Symbol(3/*S*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // S ::= MAT cc igual E 
            {
              Object RESULT = null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Matriz mt = (Matriz)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 if (mt.tipo != 3){
                                    Boolean res = parser.tablaSimbolos.referencia(mt.id, mt.dim) ;
                                    if (!res)
                                        parser.lista.add(new Errores(mtright+1, mtleft, "Error SEMANTICO: referencia de dimensiones incorrecta" ));
                                    else 
                                       escribir( mt.id + "[" + mt.cad + "]" + "=" + e.cad); 
                                 }
                             
              CUP$parser$result = new java_cup.runtime.Symbol(3/*S*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // S ::= id igual E 
            {
              Object RESULT = null;
		int idsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String ids = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right;
		Expresiones e = (Expresiones)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 escribir( ids + "=" + e.cad); 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*S*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LISTA ::= S 
            {
              Object RESULT = null;
		 System.out.println("s1");
              CUP$parser$result = new java_cup.runtime.Symbol(2/*LISTA*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LISTA ::= LISTA S 
            {
              Object RESULT = null;
		 System.out.println("s2");
              CUP$parser$result = new java_cup.runtime.Symbol(2/*LISTA*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIA ::= LISTA 
            {
              Object RESULT = null;
		System.out.println("salio");
              CUP$parser$result = new java_cup.runtime.Symbol(1/*INICIA*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIA EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

