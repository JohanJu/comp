package lang.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
/**
 * @ast interface
 * @aspect Visitor
 * @declaredat C:\\avx\\ws\\comp\\A3-SC\\src\\jastadd\\Visitor.jrag:7
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
