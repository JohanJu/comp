package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
/**
 * @ast class
 * @aspect MSN
 * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A2-MinimalAST\\src\\jastadd\\MSN.jrag:6
 */
public class depthTable extends java.lang.Object {
  
	private HashSet<Integer> depth;

  

	public void add(Integer d) {
	depth.add(d);
	}


}
