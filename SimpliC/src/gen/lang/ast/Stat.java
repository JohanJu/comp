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
 * @declaredat /home/john/SimpliC/src/jastadd/lang.ast:9
 * @production Stat : {@link ASTNode};

 */
public abstract class Stat extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect CodeGen
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:160
   */
  public void genEval(PrintStream out)
	{
	    ;
	}
  /**
   * @aspect Interpreter
   * @declaredat /home/john/SimpliC/src/jastadd/Interpretor.jrag:38
   */
  public abstract int eval(ActivationRecord actrec);
  /**
   * @aspect PrettyPrint
   * @declaredat /home/john/SimpliC/src/jastadd/PrettyPrint.jrag:15
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind+"Stat");
	}
  /**
   * @aspect Visitor
   * @declaredat /home/john/SimpliC/src/jastadd/Visitor.jrag:37
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
/** @apilevel internal */
protected boolean expectedType_visited = false;
  /**
   * @attribute syn
   * @aspect Type
   * @declaredat /home/john/SimpliC/src/jastadd/Type.jrag:27
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/john/SimpliC/src/jastadd/Type.jrag:27")
  public Type expectedType() {
    if (expectedType_visited) {
      throw new RuntimeException("Circular definition of attribute Stat.expectedType().");
    }
    expectedType_visited = true;
    Type expectedType_value = intType();
    expectedType_visited = false;
    return expectedType_value;
  }
/** @apilevel internal */
protected java.util.Set compatibleType_Type_visited;
  /**
   * @attribute syn
   * @aspect Type
   * @declaredat /home/john/SimpliC/src/jastadd/Type.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/john/SimpliC/src/jastadd/Type.jrag:31")
  public boolean compatibleType(Type t) {
    Object _parameters = t;
    if (compatibleType_Type_visited == null) compatibleType_Type_visited = new java.util.HashSet(4);
    if (compatibleType_Type_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Stat.compatibleType(Type).");
    }
    compatibleType_Type_visited.add(_parameters);
    try {
    		// System.out.println(t.getString()+" asd");
    		return t == expectedType() || t == unknownType();
    	}
    finally {
      compatibleType_Type_visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean typeOk_visited = false;
  /**
   * @attribute syn
   * @aspect Type
   * @declaredat /home/john/SimpliC/src/jastadd/Type.jrag:35
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Type", declaredAt="/home/john/SimpliC/src/jastadd/Type.jrag:35")
  public boolean typeOk() {
    if (typeOk_visited) {
      throw new RuntimeException("Circular definition of attribute Stat.typeOk().");
    }
    typeOk_visited = true;
    boolean typeOk_value = true;
    typeOk_visited = false;
    return typeOk_value;
  }
  /**
   * @attribute inh
   * @aspect CodeGen
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:126
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CodeGen", declaredAt="/home/john/SimpliC/src/jastadd/CodeGen.jrag:126")
  public String flable() {
    if (flable_visited) {
      throw new RuntimeException("Circular definition of attribute Stat.flable().");
    }
    flable_visited = true;
    String flable_value = getParent().Define_flable(this, null);
    flable_visited = false;
    return flable_value;
  }
/** @apilevel internal */
protected boolean flable_visited = false;
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:105
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/home/john/SimpliC/src/jastadd/NameAnalysis.jrag:105")
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
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/john/SimpliC/src/jastadd/Errors.jrag:47
    if (!typeOk()) {
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
    if (!typeOk()) {
      collection.add(error("wrong type: "));
    }
  }
}
