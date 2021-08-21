// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/analizadores/lexico.jflex

package analizadores;
import java_cup.runtime.*;
import proyecto.pkg1.pkg_.analizador.de.copias.*;
import java.io.PrintStream;
import javax.swing.JTextArea;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\1\22\0\1\4\1\5"+
    "\1\6\4\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\12\17\1\0\1\20\1\21\1\22"+
    "\1\23\2\0\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\2\27\1\35\1\36\1\37\1\40"+
    "\2\27\1\41\1\42\1\43\1\44\1\27\1\45\3\27"+
    "\4\0\1\46\1\0\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\2\27\1\35\1\36\1\37"+
    "\1\40\2\27\1\41\1\42\1\43\1\44\1\27\1\45"+
    "\3\27\1\47\1\50\1\51\7\0\1\3\113\0\1\27"+
    "\37\0\1\27\76\0\2\52\115\0\1\53\u019c\0\1\54"+
    "\1\55\12\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\10\21\1\1\1\22\1\23\2\1\1\0"+
    "\1\24\1\0\4\21\1\25\3\21\1\25\1\0\1\26"+
    "\2\21\1\0\1\27\4\21\2\0\1\21\2\30\1\31"+
    "\2\21\1\0\1\21\1\0\3\21\1\0\2\32\1\21"+
    "\1\33\2\34\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\56\0\56\0\212\0\56\0\56"+
    "\0\56\0\56\0\56\0\56\0\56\0\270\0\56\0\56"+
    "\0\56\0\56\0\346\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc"+
    "\0\u01fa\0\u0228\0\u0256\0\56\0\56\0\u0284\0\u02b2\0\212"+
    "\0\56\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\346\0\u03c6"+
    "\0\u03f4\0\u0422\0\56\0\u0450\0\u02e0\0\u047e\0\u04ac\0\u04da"+
    "\0\346\0\u0508\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c"+
    "\0\346\0\56\0\346\0\u064a\0\u0678\0\u06a6\0\u06d4\0\u0702"+
    "\0\u0730\0\u075e\0\u078c\0\u07ba\0\346\0\56\0\u07e8\0\346"+
    "\0\346\0\56\0\346";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\2\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\2\23\1\25"+
    "\1\26\2\23\1\27\2\23\1\30\2\23\1\31\2\23"+
    "\1\32\1\33\1\34\1\2\1\35\1\36\1\37\1\6"+
    "\1\2\57\0\1\3\2\0\1\3\51\0\2\40\1\41"+
    "\3\40\1\41\46\40\1\41\15\0\1\42\1\0\1\16"+
    "\55\0\1\23\4\0\23\23\26\0\1\23\4\0\14\23"+
    "\1\43\6\23\26\0\1\23\4\0\11\23\1\44\11\23"+
    "\26\0\1\23\4\0\14\23\1\45\3\23\1\46\2\23"+
    "\26\0\1\23\4\0\5\23\1\47\15\23\26\0\1\23"+
    "\4\0\20\23\1\50\2\23\26\0\1\23\4\0\17\23"+
    "\1\51\3\23\26\0\1\23\4\0\7\23\1\52\13\23"+
    "\33\0\22\23\41\0\1\53\67\0\1\54\16\0\1\55"+
    "\12\0\1\55\30\0\1\55\24\0\1\23\4\0\14\23"+
    "\1\56\6\23\26\0\1\23\4\0\16\23\1\57\4\23"+
    "\4\0\1\60\21\0\1\23\4\0\15\23\1\61\5\23"+
    "\26\0\1\23\4\0\13\23\1\62\7\23\26\0\1\23"+
    "\4\0\12\23\1\63\10\23\26\0\1\23\4\0\15\23"+
    "\1\64\5\23\26\0\1\23\4\0\10\23\1\65\12\23"+
    "\3\0\1\66\44\0\1\67\33\0\1\23\4\0\11\23"+
    "\1\70\11\23\26\0\1\23\4\0\4\23\1\71\16\23"+
    "\37\0\1\72\44\0\1\23\4\0\2\23\1\73\20\23"+
    "\26\0\1\23\4\0\1\23\1\74\21\23\26\0\1\23"+
    "\4\0\10\23\1\75\12\23\3\0\1\76\22\0\1\23"+
    "\4\0\11\23\1\77\11\23\44\0\1\100\54\0\1\76"+
    "\15\0\1\76\22\0\1\23\4\0\4\23\1\101\16\23"+
    "\26\0\1\23\4\0\4\23\1\102\16\23\26\0\1\23"+
    "\4\0\13\23\1\103\7\23\46\0\1\104\35\0\1\23"+
    "\4\0\4\23\1\105\16\23\37\0\1\106\44\0\1\23"+
    "\4\0\1\107\22\23\26\0\1\23\4\0\15\23\1\110"+
    "\5\23\26\0\1\23\4\0\6\23\1\111\14\23\41\0"+
    "\1\112\42\0\1\23\4\0\13\23\1\113\7\23\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2070];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\1\1\7\11\1\1\4\11"+
    "\11\1\2\11\2\1\1\0\1\11\1\0\10\1\1\11"+
    "\1\0\3\1\1\0\5\1\2\0\2\1\1\11\3\1"+
    "\1\0\1\1\1\0\3\1\1\0\1\1\1\11\3\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[75];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexico(java.io.Reader in) {
      yyline = 1;
    yycolumn = 1;
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yycolumn);
   addError("Este es un error lexico: ", yytext(), yyline, yycolumn);
   addLista("Este es un error lexico: ", yytext(), yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 2:
            { 
            }
            // fall through
          case 31: break;
          case 3:
            { yycolumn=1;
            }
            // fall through
          case 32: break;
          case 4:
            { return new Symbol(sym.not,yycolumn,yyline,yytext());
            }
            // fall through
          case 33: break;
          case 5:
            { return new Symbol(sym.par1,yycolumn,yyline,yytext());
            }
            // fall through
          case 34: break;
          case 6:
            { return new Symbol(sym.par2,yycolumn,yyline,yytext());
            }
            // fall through
          case 35: break;
          case 7:
            { return new Symbol(sym.por, yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 36: break;
          case 8:
            { return new Symbol(sym.mas, yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 37: break;
          case 9:
            { return new Symbol(sym.coma,yycolumn,yyline,yytext());
            }
            // fall through
          case 38: break;
          case 10:
            { return new Symbol(sym.menos, yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 39: break;
          case 11:
            { return new Symbol(sym.dividido, yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 40: break;
          case 12:
            { return new Symbol(sym.entero,yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 41: break;
          case 13:
            { return new Symbol(sym.puntoycoma,yycolumn,yyline,yytext());
            }
            // fall through
          case 42: break;
          case 14:
            { return new Symbol(sym.menor,yycolumn,yyline,yytext());
            }
            // fall through
          case 43: break;
          case 15:
            { return new Symbol(sym.igual,yycolumn,yyline,yytext());
            }
            // fall through
          case 44: break;
          case 16:
            { return new Symbol(sym.mayor,yycolumn,yyline,yytext());
            }
            // fall through
          case 45: break;
          case 17:
            { return new Symbol(sym.identificador,yycolumn,yyline,yytext());
            }
            // fall through
          case 46: break;
          case 18:
            { return new Symbol(sym.llave1,yycolumn,yyline,yytext());
            }
            // fall through
          case 47: break;
          case 19:
            { return new Symbol(sym.llave2,yycolumn,yyline,yytext());
            }
            // fall through
          case 48: break;
          case 20:
            { return new Symbol(sym.cadena,yyline,yychar, yytext());
            }
            // fall through
          case 49: break;
          case 21:
            { return new Symbol(sym.pr_if,yyline,yychar, yytext());
            }
            // fall through
          case 50: break;
          case 22:
            { return new Symbol(sym.decimal,yyline, (int) yycolumn, yytext());
            }
            // fall through
          case 51: break;
          case 23:
            { return new Symbol(sym.pr_for,yyline,yychar, yytext());
            }
            // fall through
          case 52: break;
          case 24:
            { return new Symbol(sym.pr_else,yyline,yychar, yytext());
            }
            // fall through
          case 53: break;
          case 25:
            { return new Symbol(sym.pr_func,yyline,yychar, yytext());
            }
            // fall through
          case 54: break;
          case 26:
            { return new Symbol(sym.pr_while,yyline,yychar, yytext());
            }
            // fall through
          case 55: break;
          case 27:
            { return new Symbol(sym.pr_number,yyline,yychar, yytext());
            }
            // fall through
          case 56: break;
          case 28:
            { return new Symbol(sym.pr_string,yyline,yychar, yytext());
            }
            // fall through
          case 57: break;
          case 29:
            { return new Symbol(sym.pr_boolean,yyline,yychar, yytext());
            }
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
