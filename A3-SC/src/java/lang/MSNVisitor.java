package lang;

import lang.ast.*;

/**
 * Checks if there are any 'ask user' statements in a Calc program.
 */
public class MSNVisitor extends TraversingVisitor {
	// client method
	public static int result(ASTNode n) {
		MSNVisitor v = new MSNVisitor();
		n.accept(v, 0);
		return v.msn;
	}

	private int msn = 0;

	public Object visit(Func node, Object data) {
		int a = (Integer)data+1;
		msn = Math.max(msn, a);
		visitChildren(node, a);
		return data;
	}
	public Object visit(If node, Object data) {
		int a = (Integer)data+1;
		msn = Math.max(msn, a);
		visitChildren(node, a);
		return data;
	}
	public Object visit(While node, Object data) {
		int a = (Integer)data+1;
		msn = Math.max(msn, a);
		visitChildren(node, a);
		return data;
	}
}
