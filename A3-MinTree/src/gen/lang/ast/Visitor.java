package lang.ast;

import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;
/**
 * @ast interface
 * @aspect Visitor
 * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\Visitor.jrag:6
 */
public interface Visitor {

		 
		public Object visit(List node, Object data);

		 
		public Object visit(Opt node, Object data);

		 
		public Object visit(Program node, Object data);

		 
		public Object visit(Func node, Object data);


		/*STAT*/
		 

		/*STAT*/
		public Object visit(Decl node, Object data);

		 
		public Object visit(Assi node, Object data);

		 
		public Object visit(If node, Object data);

		 
		public Object visit(Else node, Object data);

		 
		public Object visit(While node, Object data);

		 
		public Object visit(Ret node, Object data);


		/*EXPR*/
		 

		/*EXPR*/
		public Object visit(EqExp node, Object data);

		 
		public Object visit(NeExp node, Object data);

		 
		public Object visit(GtExp node, Object data);

		 
		public Object visit(LtExp node, Object data);

		 
		public Object visit(LeExp node, Object data);

		 
		public Object visit(GeExp node, Object data);

		 
		public Object visit(Mul node, Object data);

		 
		public Object visit(Div node, Object data);

		 
		public Object visit(Mod node, Object data);

		 
		public Object visit(Add node, Object data);

		 
		public Object visit(Sub node, Object data);

		 
		public Object visit(Num node, Object data);

		
		 
		
		public Object visit(IdUse node, Object data);

		 
		public Object visit(Fcall node, Object data);
}
