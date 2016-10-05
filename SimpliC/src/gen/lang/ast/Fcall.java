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
/**
 * @ast node
 * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\lang.ast:19
 * @production Fcall : {@link Expr} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link Expr}*</span>;

 */
public class Fcall extends Expr implements Cloneable {
  /**
   * @aspect Interpreter
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Interpretor.jrag:130
   */
  public int eval(ActivationRecord actrec){
		ActivationRecord a = new ActivationRecord();
		Func f = decl();
		for (int i = 0; i < f.getNumArgs(); ++i) {
			a.m.put(((IdDecl)f.getArgs(i)).getID(),getExpr(i).eval(actrec));
		}
		return f.eval(a);
	}
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\PrettyPrint.jrag:139
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind+getID()+"(");
		String s = "";
		for (int i = 0; i < getNumExpr(); ++i) {
			out.print(s);
			getExpr(i).prettyPrint(out, "");
			s = ", ";

		}
		out.print(")");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Fcall() {
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
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Fcall(String p0, List<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @declaredat ASTNode:18
   */
  public Fcall(beaver.Symbol p0, List<Expr> p1) {
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
  public Fcall clone() throws CloneNotSupportedException {
    Fcall node = (Fcall) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Fcall copy() {
    try {
      Fcall node = (Fcall) clone();
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
  public Fcall fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public Fcall treeCopyNoTransform() {
    Fcall tree = (Fcall) copy();
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
  public Fcall treeCopy() {
    Fcall tree = (Fcall) copy();
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
    return super.is$Equal(node) && (tokenString_ID == ((Fcall) node).tokenString_ID);    
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
   * Replaces the Expr list.
   * @param list The new list node to be used as the Expr list.
   * @apilevel high-level
   */
  public void setExprList(List<Expr> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Expr list.
   * @return Number of children in the Expr list.
   * @apilevel high-level
   */
  public int getNumExpr() {
    return getExprList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Expr list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Expr list.
   * @apilevel low-level
   */
  public int getNumExprNoTransform() {
    return getExprListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Expr list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Expr list.
   * @apilevel high-level
   */
  public Expr getExpr(int i) {
    return (Expr) getExprList().getChild(i);
  }
  /**
   * Check whether the Expr list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExpr() {
    return getExprList().getNumChild() != 0;
  }
  /**
   * Append an element to the Expr list.
   * @param node The element to append to the Expr list.
   * @apilevel high-level
   */
  public void addExpr(Expr node) {
    List<Expr> list = (parent == null) ? getExprListNoTransform() : getExprList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExprNoTransform(Expr node) {
    List<Expr> list = getExprListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Expr list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExpr(Expr node, int i) {
    List<Expr> list = getExprList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Expr")
  public List<Expr> getExprList() {
    List<Expr> list = (List<Expr>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprListNoTransform() {
    return (List<Expr>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Expr list without
   * triggering rewrites.
   */
  public Expr getExprNoTransform(int i) {
    return (Expr) getExprListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Expr list.
   * @return The node representing the Expr list.
   * @apilevel high-level
   */
  public List<Expr> getExprs() {
    return getExprList();
  }
  /**
   * Retrieves the Expr list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expr list.
   * @apilevel low-level
   */
  public List<Expr> getExprsNoTransform() {
    return getExprListNoTransform();
  }
/** @apilevel internal */
protected boolean decl_visited = false;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:4")
  public Func decl() {
    if (decl_visited) {
      throw new RuntimeException("Circular definition of attribute Fcall.decl().");
    }
    decl_visited = true;
    Func decl_value = Flookup(getID());
    decl_visited = false;
    return decl_value;
  }
/** @apilevel internal */
protected boolean nbrArgOk_visited = false;
  /**
   * @attribute syn
   * @aspect Type
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Type.jrag:38
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Type.jrag:38")
  public boolean nbrArgOk() {
    if (nbrArgOk_visited) {
      throw new RuntimeException("Circular definition of attribute Fcall.nbrArgOk().");
    }
    nbrArgOk_visited = true;
    try {
    		
    		// System.out.println(decl()+" asd");
    		// System.out.println(decl().getID()+" qwe");
    		if(decl() == UnknownFunc() || decl().getID() == "print" || decl().getID() == "read" )
    			return true;
    		
    		return getNumExpr() == decl().getNumArgs();
    	}
    finally {
      nbrArgOk_visited = false;
    }
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:5")
  public Func Flookup(String name) {
    Object _parameters = name;
    if (Flookup_String_visited == null) Flookup_String_visited = new java.util.HashSet(4);
    if (Flookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Fcall.Flookup(String).");
    }
    Flookup_String_visited.add(_parameters);
    Func Flookup_String_value = getParent().Define_Flookup(this, null, name);
    Flookup_String_visited.remove(_parameters);
    return Flookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set Flookup_String_visited;
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Errors.jrag:35
    if (decl().isUnknown()) {
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
    // @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Errors.jrag:51
    if (!nbrArgOk()) {
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
    if (decl().isUnknown()) {
      collection.add(error("func '" + getID() + "' has not been declared before this use!"));
    }
    if (!nbrArgOk()) {
      collection.add(error("wrong nbr args: " + getID()));
    }
  }
}
