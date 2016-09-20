/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\Lang.ast:26
 * @production Num : {@link Expr} ::= <span class="component">&lt;NUM:String&gt;</span>;

 */
public class Num extends Expr implements Cloneable {
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\Visitor.jrag:106
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public Num() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  public Num(String p0) {
    setNUM(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:16
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:20
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:24
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public Num clone() throws CloneNotSupportedException {
    Num node = (Num) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public Num copy() {
    try {
      Num node = (Num) clone();
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
   * @declaredat ASTNode:52
   */
  @Deprecated
  public Num fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:62
   */
  public Num treeCopyNoTransform() {
    Num tree = (Num) copy();
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
   * @declaredat ASTNode:82
   */
  public Num treeCopy() {
    Num tree = (Num) copy();
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
   * @declaredat ASTNode:96
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_NUM == ((Num) node).tokenString_NUM);    
  }
  /**
   * Replaces the lexeme NUM.
   * @param value The new value for the lexeme NUM.
   * @apilevel high-level
   */
  public void setNUM(String value) {
    tokenString_NUM = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_NUM;
  /**
   * Retrieves the value for the lexeme NUM.
   * @return The value for the lexeme NUM.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="NUM")
  public String getNUM() {
    return tokenString_NUM != null ? tokenString_NUM : "";
  }
}