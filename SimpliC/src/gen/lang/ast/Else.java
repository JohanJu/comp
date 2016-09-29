/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package lang.ast;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\lang.ast:11
 * @production Else : {@link Stat} ::= <span class="component">{@link Stat}*</span>;

 */
public class Else extends Stat implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\PrettyPrint.jrag:57
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.println(ind+"else {");
		for (int i = 0; i < getNumStat(); ++i) {
			getStat(i).prettyPrint(out, ind+"  ");
			out.print("\n");
		}
		out.print(ind+"}");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Else() {
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
  public Else(List<Stat> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 1;
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
  public Else clone() throws CloneNotSupportedException {
    Else node = (Else) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public Else copy() {
    try {
      Else node = (Else) clone();
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
  public Else fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public Else treeCopyNoTransform() {
    Else tree = (Else) copy();
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
  public Else treeCopy() {
    Else tree = (Else) copy();
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
   * Replaces the Stat list.
   * @param list The new list node to be used as the Stat list.
   * @apilevel high-level
   */
  public void setStatList(List<Stat> list) {
    setChild(list, 0);
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
    List<Stat> list = (List<Stat>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Stat list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stat list.
   * @apilevel low-level
   */
  public List<Stat> getStatListNoTransform() {
    return (List<Stat>) getChildNoTransform(0);
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
/** @apilevel internal */
protected java.util.Set localLookup_String_Object_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:39
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:39")
  public IdDecl localLookup(String name, Object o) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(o);
    if (localLookup_String_Object_visited == null) localLookup_String_Object_visited = new java.util.HashSet(4);
    if (localLookup_String_Object_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Else.localLookup(String,Object).");
    }
    localLookup_String_Object_visited.add(_parameters);
    try {
    		for (int i = 0; i <= getNumStat()-1; i++) {
    			if (getStat(i) instanceof IdDecl && ((IdDecl)getStat(i)).getID().equals(name)) {
    				return ((IdDecl)getStat(i));
    			}
    			if (getStat(i) == o) {
    				return unknownDecl();
    			}
    		}
    		return unknownDecl();
    	}
    finally {
      localLookup_String_Object_visited.remove(_parameters);
    }
  }
  /**
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:3
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name, Object o) {
    if (_callerNode == getStatListNoTransform()) {
      // @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:11
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      {
      		IdDecl decl = localLookup(name, o);
      		return !decl.isUnknown() ? decl : lookup(name, this);
      	}
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name, o);
    }
  }
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name, Object o) {
    return true;
  }
}
