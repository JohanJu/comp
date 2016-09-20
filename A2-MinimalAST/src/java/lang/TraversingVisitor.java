package lang;

import lang.ast.*;

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */
public abstract class TraversingVisitor implements lang.ast.Visitor {

	private Object visitChildren(ASTNode node, Object data) {
		for (int i = 0; i < node.getNumChild(); ++i) {
			node.getChild(i).accept(this, data);
		}
		return data;
	}

	public Object visit(List node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Opt node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Program node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Func node, Object data) {
		return visitChildren(node, data);
	}
	/*STAT*/
	public Object visit(Decl node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Assi node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(If node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Else node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(While node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Ret node, Object data) {
		return visitChildren(node, data);
	}
	/*EXPR*/
	public Object visit(EqExp node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(NeExp node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(GtExp node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(LtExp node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(GeExp node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Mul node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Div node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Mod node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Add node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Sub node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Num node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(IdUse node, Object data) {
		return visitChildren(node, data);
	}
	public Object visit(Fcall node, Object data) {
		return visitChildren(node, data);
	}
}
