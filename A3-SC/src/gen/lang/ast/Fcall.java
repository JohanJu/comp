/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.HashSet;
import java.util.*;
/**
 * @ast node
 * @declaredat C:\\avx\\ws\\comp\\A3-SC\\src\\jastadd\\lang.ast:13
 * @production Fcall : {@link Expr} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">{@link Expr}*</span>;

 */
public class Fcall extends Expr implements Cloneable {
  /**
   * @aspect NameAnalysis
   * @declaredat C:\\avx\\ws\\comp\\A3-SC\\src\\jastadd\\NameAnalysis.jrag:146
   */
  public void checkNames(PrintStream err, SymbolTable symbols) {
		if (!symbols.lookupf(getID())) {
			err.format("Error at line %d: func \'%s\' has not been declared before this use!", getLine(), getID());
			err.println();
		}
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
}
