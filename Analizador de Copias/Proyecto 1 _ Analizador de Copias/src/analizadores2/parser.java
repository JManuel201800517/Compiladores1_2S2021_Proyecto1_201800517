
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores2;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\011\000\002\002\004\000\002\002\003\000\002\003" +
    "\002\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\020\002\uffff\004\uffff\005\uffff\006\uffff\007" +
    "\uffff\010\005\011\004\001\002\000\014\002\ufff9\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\001\002\000\014\002\ufffa\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\001\002\000\014\002\000" +
    "\004\012\005\013\006\011\007\014\001\002\000\004\002" +
    "\010\001\002\000\004\002\001\001\002\000\020\002\uffff" +
    "\004\uffff\005\uffff\006\uffff\007\uffff\010\005\011\004\001" +
    "\002\000\020\002\uffff\004\uffff\005\uffff\006\uffff\007\uffff" +
    "\010\005\011\004\001\002\000\020\002\uffff\004\uffff\005" +
    "\uffff\006\uffff\007\uffff\010\005\011\004\001\002\000\020" +
    "\002\uffff\004\uffff\005\uffff\006\uffff\007\uffff\010\005\011" +
    "\004\001\002\000\014\002\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\007\ufffb\001\002\000\014\002\ufffd\004\ufffd\005\ufffd\006" +
    "\011\007\014\001\002\000\014\002\ufffe\004\ufffe\005\ufffe" +
    "\006\011\007\014\001\002\000\014\002\ufffc\004\ufffc\005" +
    "\ufffc\006\ufffc\007\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\016\000\006\002\006\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\003\017\001\001\000\004\003" +
    "\016\001\001\000\004\003\015\001\001\000\004\003\014" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

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



    public void syntax_error(Symbol s){
        System.out.println("Erroe Sintactico en la linea "+s.left+" Columna "+s.right+". No se esperaba este componente: "+s.value+".");
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
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
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= EXP 
            {
              Object RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double var1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println(var1);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // EXP ::= 
            {
              Double RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXP ::= EXP mas EXP 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double var1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double var2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=var1+var2;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // EXP ::= EXP menos EXP 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double var1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double var2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=var1-var2;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXP ::= EXP por EXP 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double var1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double var2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=var1*var2;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXP ::= EXP dividido EXP 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Double var1 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double var2 = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=var1/var2;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXP ::= entero 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Double(var1);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXP ::= decimal 
            {
              Double RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Double(var1);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
