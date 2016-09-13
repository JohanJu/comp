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
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
ID = [a-zA-Z]+
TYPE = "int"
NUM = [0-9]+
%%

// discard whitespace information
{WhiteSpace}  { }

// token definitions
";"           { System.out.println("SC"); return sym(Terminals.SC); }
"="           { System.out.println("EQ"); return sym(Terminals.EQ); }
"("           { System.out.println("LP"); return sym(Terminals.LP); }
")"           { System.out.println("RP"); return sym(Terminals.RP); }
"{"           { System.out.println("LB"); return sym(Terminals.LB); }
"}"           { System.out.println("RB"); return sym(Terminals.RB); }
{TYPE}        { System.out.println("TYPE"); return sym(Terminals.TYPE); }
{ID}          { System.out.println("ID"); return sym(Terminals.ID); }
{NUM}         { System.out.println("NUM"); return sym(Terminals.NUM); }
<<EOF>>       { System.out.println("EOF"); return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
