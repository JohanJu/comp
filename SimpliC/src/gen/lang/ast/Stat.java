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
 * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\lang.ast:6
 * @production Stat : {@link ASTNode};

 */
public abstract class Stat extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\PrettyPrint.jrag:15
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind+"Stat");
	}
  /**
   * @aspect Visitor
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\Visitor.jrag:37
   */
  public Object accept(Visitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }
  /**
   * @declaredat ASTNode:1
   */
  public Stat() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:17
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:21
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public Stat clone() throws CloneNotSupportedException {
    Stat node = (Stat) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:36
   */
  @Deprecated
  public abstract Stat fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:44
   */
  public abstract Stat treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:52
   */
  public abstract Stat treeCopy();
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:105
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\avx\\ws\\comp\\SimpliC\\src\\jastadd\\NameAnalysis.jrag:105")
  public IdDecl lookup(String name, Object o) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(o);
    if (lookup_String_Object_visited == null) lookup_String_Object_visited = new java.util.HashSet(4);
    if (lookup_String_Object_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stat.lookup(String,Object).");
    }
    lookup_String_Object_visited.add(_parameters);
    IdDecl lookup_String_Object_value = getParent().Define_lookup(this, null, name, o);
    lookup_String_Object_visited.remove(_parameters);
    return lookup_String_Object_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_Object_visited;
}
