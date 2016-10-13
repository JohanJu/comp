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
 * @ast interface
 * @aspect Visitor
 * @declaredat /home/john/SimpliC/src/jastadd/Visitor.jrag:7
 */
public interface Visitor {

         
        public Object visit(List node, Object data);

         
        public Object visit(Opt node, Object data);

         
        public Object visit(Program node, Object data);

         
        public Object visit(Func node, Object data);

         
        public Object visit(Stat node, Object data);

         
        public Object visit(If node, Object data);

         
        public Object visit(While node, Object data);
}
