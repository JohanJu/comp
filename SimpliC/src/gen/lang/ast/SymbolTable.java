package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
import java.util.*;
/**
 * @ast class
 * @aspect NameAnalysis
 * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:6
 */
public class SymbolTable extends java.lang.Object {
  
		private static final SymbolTable BOTTOM = new SymbolTable() {
			@Override
			public boolean declare(String name) {
				throw new UnsupportedOperationException(
						"can not add name to bottom of name stack");
			}
			@Override
			public boolean lookup(String name) {
				return false;
			}
		};

  

		private final SymbolTable tail;

  
		private final Set<String> names = new HashSet<String>();

  
		private final static Set<String> funcs = new HashSet<String>();

  
		public void clean() {
			funcs.clear();
		}

  
		public boolean lookupf(String name) {
			Iterator iter = funcs.iterator();
			// while (iter.hasNext()) {
			//     System.out.println("it "+iter.next());
			// }
			return funcs.contains(name);
		}

  
		public boolean declaref(String name) {
			return funcs.add(name);
		}

  

		public SymbolTable() {
			tail = BOTTOM;
		}

  

		public SymbolTable(SymbolTable tail) {
			this.tail = tail;
		}

  

		/**
		 * Attempt to add a new name to the symbol table.
		 * @return true if name was not already declared
		 */
		public boolean declare(String name) {
			return names.add(name);
		}

  

		/**
		 * @return true if name has been declared
		 */
		public boolean lookup(String name) {
			return names.contains(name) || tail.lookup(name);
		}

  

		/**
		 * Push a new table on the stack.
		 * @return the new top of the stack
		 */
		public SymbolTable push() {
			return new SymbolTable(this);
		}


}
