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
 * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\lang.ast:6
 * @production Assi : {@link Stat} ::= <span class="component">{@link IdUse}</span> <span class="component">{@link Expr}</span>;

 */
public class Assi extends Stat implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\PrettyPrint.jrag:72
   */
  public void prettyPrint(PrintStream out, String ind) {
		getIdUse().prettyPrint(out, ind);
		out.print(" = ");
		getExpr().prettyPrint(out, "");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Assi() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public Assi(IdUse p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:22
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public Assi clone() throws CloneNotSupportedException {
    Assi node = (Assi) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Assi copy() {
    try {
      Assi node = (Assi) clone();
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
   * @declaredat ASTNode:54
   */
  @Deprecated
  public Assi fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public Assi treeCopyNoTransform() {
    Assi tree = (Assi) copy();
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
   * @declaredat ASTNode:84
   */
  public Assi treeCopy() {
    Assi tree = (Assi) copy();
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
   * @declaredat ASTNode:98
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the IdUse child.
   * @param node The new node to replace the IdUse child.
   * @apilevel high-level
   */
  public void setIdUse(IdUse node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdUse child.
   * @return The current node used as the IdUse child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdUse")
  public IdUse getIdUse() {
    return (IdUse) getChild(0);
  }
  /**
   * Retrieves the IdUse child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdUse child.
   * @apilevel low-level
   */
  public IdUse getIdUseNoTransform() {
    return (IdUse) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
}