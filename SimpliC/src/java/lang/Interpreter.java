package lang;

import lang.ast.*;
import java.io.FileReader;

/**
 * Checks if there are any 'ask user' statements in a Calc program.
 */
public class Interpreter {
	public static void main(String[] args) {
		try {
			if (args.length != 1) {
				System.err.println(
						"You must specify a source file on the command line!");
				System.exit(1);
				return;
			}

			String filename = args[0];
			LangScanner scanner = new LangScanner(new FileReader(filename));
			LangParser parser = new LangParser();
			Program program = (Program) parser.parse(scanner);

			for (ErrorMessage m: program.errors()) {
				System.out.println(m);
				System.exit(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
