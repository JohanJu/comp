package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol 
%function nextToken 

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
	static final boolean DEBUG = false;
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r 
ID = [a-zA-Z][a-zA-Z0-9]*
TYPE = "int"
NUM = [0-9]+
Comment = \/\/.*(\r|\n|\r\n)
Cmp = "==" | "!=" | ">=" | "<=" | ">" | "<"
%%

// discard whitespace information
{WhiteSpace}  { }
{Comment}  { }

// token definitions
"while"		{ return sym(Terminals.WHILE); 	}
"return"		{if(DEBUG){System.out.println("ret");} return sym(Terminals.RET); 	}
// "print"		{ return sym(Terminals.PRINT);	}
"else"		{ return sym(Terminals.ELSE); 	}
// "read"		{ return sym(Terminals.READ);	}
"if"		{ return sym(Terminals.IF); 	}
"/"			{ return sym(Terminals.DIV); 	}
"%"			{ return sym(Terminals.MOD); 	}
"-"			{ return sym(Terminals.SUB); 	}
","			{ return sym(Terminals.COMMA); 	}
";"           { /*System.out.println("SC");*/ return sym(Terminals.SEMI); }
"="           { /*System.out.println("EQ");*/ return sym(Terminals.ASSIGN); }
"("           { /*System.out.println("LP");*/ return sym(Terminals.LP); }
")"           { /*System.out.println("RP");*/ return sym(Terminals.RP); }
"{"           { /*System.out.println("LB");*/ return sym(Terminals.LB); }
"}"           { /*System.out.println("RB");*/ return sym(Terminals.RB); }
"*"           { /*System.out.println("LB");*/ return sym(Terminals.MUL); }
"+"           { /*System.out.println("RB");*/ return sym(Terminals.ADD); }
"=="		{ return sym(Terminals.EQ); 	}
"!="		{ return sym(Terminals.NE); 	}
">="		{ return sym(Terminals.GE); 	}
"<="		{ return sym(Terminals.LE); 	}
">"			{ return sym(Terminals.GT); 	}
"<"			{ return sym(Terminals.LT); 	}
{TYPE}        { /*System.out.println("TYPE");*/ return sym(Terminals.TYPE); }
{ID}          { /*System.out.println("ID");*/ return sym(Terminals.ID); }
{NUM}         { /*System.out.println("NUM");*/ return sym(Terminals.NUM); }
<<EOF>>       { /*System.out.println("EOF");*/ return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
