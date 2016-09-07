package lang;
import lang.ast.LangParser;
import lang.ast.LangScanner;
import static lang.ast.LangParser.Terminals.*;
import java.io.File;
import java.io.FileReader;
/**
* Abstract base class for recursive decent parsers. The class provides convenience methods
* to integrate a scanner, like peeking the next token or reading a certain token. Subclasses
* must implement the parseProgram() method, which is used as entry point for recursive decent
* parsing.
*/
public class RecursiveDescentCompiler
{
    private LangScanner scanner;
    private beaver.Symbol currentToken;
    /**
    * Initialize the parser and start parsing via the parseProgram() method.
    * @param scanner providing the token stream to process; used throughout parsing
    * @throws RuntimeException if the program is not syntactically correct
    */

    public static void main(String[] args)
    {
        RecursiveDescentCompiler r = new RecursiveDescentCompiler();
        try
        {
            r.parse(new LangScanner(new FileReader(args[0])));
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

    }
    public void parse(LangScanner scanner)
    {
        this.scanner = scanner;
        parseProgram();
        accept(EOF); // Ensure all input is processed.
        System.out.println("OK");
    }
    /**
    * Entry hook to start parsing.
    * @throws RuntimeException if the program is not syntactically correct
    */
    public void parseProgram()
    {
        // for (int i = 0; i < 5; i++)
        // {
        //     System.out.println(LangParser.Terminals.NAMES[peek()]);
        // }
        stmt();
    }
    void stmt()
    {
        String token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "ID":
            assignment();
            break;
        case "IF":
            ifStmt();
            break;
        case "FOR":
            forStmt();
            break;
        default:
            error("1Expec@ng statement,	found:	"	+	token);
        }
    }
    void forStmt()
    {
        String token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "ID":
            break;
        default:
            error("1Expec@ng ID,	found:	"	+	token);
        }
        token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "EQ":
            expr();
            break;
        default:
            error("1Expec@ng EQ,	found:	"	+	token);
        }
        token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "UNTIL":
            expr();
            break;
        default:
            error("1Expec@ng UNTIL,	found:	"	+	token);
        }
        token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "DO":
            stmt();
            break;
        default:
            error("1Expec@ng DO,	found:	"	+	token);
        }
        token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "OD":
            break;
        default:
            error("1Expec@ng OD,	found:	"	+	token);
        }
    }
    void ifStmt()
    {
        expr();
        String token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "THEN":
            stmt();
            break;
        default:
            error("2Expec@ng THEN,	found:	"	+	token);
        }
        token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "FI":
            break;
        default:
            error("3Expec@ng FI,	found:	"	+	token);
        }
    }
    void assignment()
    {
        String token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "EQ":
            expr();
            break;
        default:
            error("2Expec@ng EQ,	found:	"	+	token);
        }
    }
    void expr()
    {
        String token = LangParser.Terminals.NAMES[peek()];
        System.out.println(token);
        accept();
        switch(token)
        {
        case "NOT":
            expr();
            break;
        case "ID":
            break;
        case "NUMERAL":
            break;
        default:
            error("4Expec@ng expr,	found:	"	+	token);
        }
    }
    /**
    * Peek the current token, i.e., return it without proceeding to the next token.
    * @return ID of the current token
    */
    public int peek()
    {
        if (currentToken == null) accept();
        return currentToken.getId();
    }
    /**
    * Test the current token without proceeding to the next.
    * @param expectedToken token type to test for
    * @return true, if the current token is of the expected type, otherwise false.
    */
    public boolean peek(int expectedToken)
    {
        return peek() == expectedToken;
    }
    /**
    * Read the next token (invokes the scanner to set the current token to the next).
    */
    public void accept()
    {
        try
        {
            currentToken = scanner.nextToken();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    /**
    * Ensure the current token is of a certain type; then read the next.
    * @param expectedToken token type to test for
    * @throws RuntimeException if the current token is not of the expected type
    */
    public void accept(int expectedToken)
    {
        if (!peek(expectedToken))
        {
            error("expected token " +
                  LangParser.Terminals.NAMES[expectedToken] +
                  " got token " +
                  LangParser.Terminals.NAMES[currentToken.getId()]);
        }
        accept();
    }
    /**
    * Throw runtime exception with the given message.
    * @param message of the thrown exception
    * @throws RuntimeException always thrown
    */
    public void error(String message)
    {
        throw new RuntimeException(message);
    }
}
