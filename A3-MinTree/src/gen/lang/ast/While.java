/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;
/**
 * @ast node
 * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\Lang.ast:9
 * @production While : {@link Stat} ::= <span class="component">{@link Expr}</span> <span class="component">{@link Stat}*</span>;

 */
public class While extends Stat implements Cloneable {
  /**
   * @aspect MSN
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\MSN.jrag:27
   */
  public void getDepth(PrintStream out, depthTable depth, int d) {
		if(hasStat()) {
				for (int i = 0; i < getNumStat(); ++i) {
					getDepth(out, depth, d + 1);
			}
			depth.add(d + 1);
		}
	
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\Users\\Gustav\\Desktop\\Kompilatorer\\comp\\A3-MinTree\\src\\jastadd\\Visitor.jrag:66
   */
  public Object accept(Visitor visitor, Object data) {
		return visitor.visit(this, data);
	}
  /**
   * @declaredat ASTNode:1
   */
  public While() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public While(Expr p0, List<Stat> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public While clone() throws CloneNotSupportedException {
    While node = (While) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public While copy() {
    try {
      While node = (While) clone();
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
   * @declaredat ASTNode:55
   */
  @Deprecated
  public While fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:65
   */
  public While treeCopyNoTransform() {
    While tree = (While) copy();
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
   * @declaredat ASTNode:85
   */
  public While treeCopy() {
    While tree = (While) copy();
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
   * @declaredat ASTNode:99
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expr")
  public Expr getExpr() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Stat list.
   * @param list The new list node to be used as the Stat list.
   * @apilevel high-level
   */
  public void setStatList(List<Stat> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Stat list.
   * @return Number of children in the Stat list.
   * @apilevel high-level
   */
  public int getNumStat() {
    return getStatList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Stat list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Stat list.
   * @apilevel low-level
   */
  public int getNumStatNoTransform() {
    return getStatListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Stat list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Stat list.
   * @apilevel high-level
   */
  public Stat getStat(int i) {
    return (Stat) getStatList().getChild(i);
  }
  /**
   * Check whether the Stat list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasStat() {
    return getStatList().getNumChild() != 0;
  }
  /**
   * Append an element to the Stat list.
   * @param node The element to append to the Stat list.
   * @apilevel high-level
   */
  public void addStat(Stat node) {
    List<Stat> list = (parent == null) ? getStatListNoTransform() : getStatList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addStatNoTransform(Stat node) {
    List<Stat> list = getStatListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Stat list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setStat(Stat node, int i) {
    List<Stat> list = getStatList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Stat list.
   * @return The node representing the Stat list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Stat")
  public List<Stat> getStatList() {
    List<Stat> list = (List<Stat>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Stat list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stat list.
   * @apilevel low-level
   */
  public List<Stat> getStatListNoTransform() {
    return (List<Stat>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Stat list without
   * triggering rewrites.
   */
  public Stat getStatNoTransform(int i) {
    return (Stat) getStatListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Stat list.
   * @return The node representing the Stat list.
   * @apilevel high-level
   */
  public List<Stat> getStats() {
    return getStatList();
  }
  /**
   * Retrieves the Stat list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stat list.
   * @apilevel low-level
   */
  public List<Stat> getStatsNoTransform() {
    return getStatListNoTransform();
  }
}