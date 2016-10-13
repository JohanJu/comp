package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
/**
 * @ast class
 * @aspect Interpreter
 * @declaredat /home/john/SimpliC/src/jastadd/Interpretor.jrag:6
 */
public class ActivationRecord extends java.lang.Object {
  
		public Map<String,Integer> m;

  
		public ActivationRecord(){
			m = new HashMap<String,Integer>();
		}

  
		public ActivationRecord(Map<String,Integer> map){
			m = new HashMap<String,Integer>(map);
		}


}
