/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
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
 * @ast node
 * @declaredat /home/john/SimpliC/src/jastadd/lang.ast:10
 * @production IdDecl : {@link Stat} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">[{@link Expr}]</span>;

 */
public class IdDecl extends Stat implements Cloneable {
  /**
   * Generate code to evaluate the expression and
   * store the result in RAX.
   * 
   * This must be implemented for every subclass of Expr!
   * @aspect CodeGen
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:121
   */
  String address = "";
  /**
   * @aspect CodeGen
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:239
   */
  public void genEval(PrintStream out) {
		out.println("        pushq %rcx");
		if (hasExpr()) {
			getExpr().genEval(out);
		}
		out.println("        movq %rax, "+address);
	}
  /**
   * @aspect Interpreter
   * @declaredat /home/john/SimpliC/src/jastadd/Interpretor.jrag:39
   */
  public int eval(ActivationRecord actrec){
		int i = 0;
		if (hasExpr()) {
			i = getExpr().eval(actrec);
		}
		actrec.m.put(getID(),i);
		// System.out.println("D: "+getID()+" = "+i);
		return 0;
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /home/john/SimpliC/src/jastadd/PrettyPrint.jrag:65
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind+"int "+getID());
		if (hasExpr()) {
			out.print(" = ");
			getExpr().prettyPrint(out, ind);
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdDecl() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public IdDecl(String p0, Opt<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @declaredat ASTNode:18
   */
  public IdDecl(beaver.Symbol p0, Opt<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public IdDecl clone() throws CloneNotSupportedException {
    IdDecl node = (IdDecl) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public IdDecl copy() {
    try {
      IdDecl node = (IdDecl) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:59
   */
  @Deprecated
  public IdDecl fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public IdDecl treeCopyNoTransform() {
    IdDecl tree = (IdDecl) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:89
   */
  public IdDecl treeCopy() {
    IdDecl tree = (IdDecl) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((IdDecl) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the optional node for the Expr child. This is the <code>Opt</code>
   * node containing the child Expr, not the actual child!
   * @param opt The new node to be used as the optional node for the Expr child.
   * @apilevel low-level
   */
  public void setExprOpt(Opt<Expr> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Expr child.
   * @param node The new node to be used as the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    getExprOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Expr child exists.
   * @return {@code true} if the optional Expr child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Expr child.
   * @return The Expr child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getExpr() {
    return (Expr) getExprOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Expr child. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * @return The optional node for child the Expr child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Expr")
  public Opt<Expr> getExprOpt() {
    return (Opt<Expr>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Expr. This is the <code>Opt</code> node containing the child Expr, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Expr.
   * @apilevel low-level
   */
  public Opt<Expr> getExprOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(0);
  }
/** @apilevel internal */
protected boolean isMultiplyDeclared_visited = false;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:108
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/home/john/SimpliC/src/jastadd/NameAnalysis.jrag:108")
  public boolean isMultiplyDeclared() {
    if (isMultiplyDeclared_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isMultiplyDeclared().");
    }
    isMultiplyDeclared_visited = true;
    boolean isMultiplyDeclared_value = lookup(getID(),null) != this;
    isMultiplyDeclared_visited = false;
    return isMultiplyDeclared_value;
  }
/** @apilevel internal */
protected boolean Type_visited = false;
  /**
   * @attribute syn
   * @aspect Type
   * @declaredat /home/john/SimpliC/src/jastadd/Type.jrag:25
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/john/SimpliC/src/jastadd/Type.jrag:25")
  public Type Type() {
    if (Type_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.Type().");
    }
    Type_visited = true;
    Type Type_value = intType();
    Type_visited = false;
    return Type_value;
  }
/** @apilevel internal */
protected boolean isUnknown_visited = false;
  /**
   * @attribute syn
   * @aspect UnknownDecl
   * @declaredat /home/john/SimpliC/src/jastadd/UnknownDecl.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownDecl", declaredAt="/home/john/SimpliC/src/jastadd/UnknownDecl.jrag:7")
  public boolean isUnknown() {
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attribute IdDecl.isUnknown().");
    }
    isUnknown_visited = true;
    boolean isUnknown_value = false;
    isUnknown_visited = false;
    return isUnknown_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:107
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/home/john/SimpliC/src/jastadd/NameAnalysis.jrag:107")
  public IdDecl lookup(String name, Object o) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(o);
    if (lookup_String_Object_visited == null) lookup_String_Object_visited = new java.util.HashSet(4);
    if (lookup_String_Object_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdDecl.lookup(String,Object).");
    }
    lookup_String_Object_visited.add(_parameters);
    IdDecl lookup_String_Object_value = getParent().Define_lookup(this, null, name, o);
    lookup_String_Object_visited.remove(_parameters);
    return lookup_String_Object_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_Object_visited;
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/john/SimpliC/src/jastadd/Errors.jrag:43
    if (isMultiplyDeclared()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (isMultiplyDeclared()) {
      collection.add(error("symbol '" + getID() + "' is already declared!"));
    }
  }
}
