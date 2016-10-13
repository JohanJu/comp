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
 * @declaredat /home/john/SimpliC/src/jastadd/lang.ast:13
 * @production If : {@link Stat} ::= <span class="component">{@link Expr}</span> <span class="component">{@link Stat}*</span> <span class="component">[{@link Else}]</span>;

 */
public class If extends Stat implements Cloneable {
  /**
   * @aspect CodeGen
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:174
   */
  public void genEval(PrintStream out)
	{
		// out.println("        1 ");
		getExpr().genEval(out);
		// out.println("        2 ");

		for (int i = 0; i < getNumStat(); ++i) {

			getStat(i).genEval(out);
		}
		out.println("        jmp "+flable()+"fi");
		
		out.println(flable()+"else:");
		if (hasElse()) {
			getElse().genEval(out);
		}
	    out.println(flable()+"fi:");
	}
  /**
   * @aspect Interpreter
   * @declaredat /home/john/SimpliC/src/jastadd/Interpretor.jrag:55
   */
  public int eval(ActivationRecord actrec){
		int j = getExpr().eval(actrec);
		if(j==1){
			// ActivationRecord a = new ActivationRecord(actrec.m);
			for (int i = 0; i < getNumStat(); ++i) {
				if(actrec.m.containsKey("ret")){
					return actrec.m.get("ret");
				}
				int r = getStat(i).eval(actrec);
				if(getStat(i) instanceof Ret){
					actrec.m.put("ret",r);
					// System.out.println("Ret: "+r);
					return r;
				}
			}
		}if(j == 0&&hasElse()){
			ActivationRecord a = new ActivationRecord(actrec.m);
			getElse().eval(actrec);
		}
		return 0;
	}
  /**
   * @aspect PrettyPrint
   * @declaredat /home/john/SimpliC/src/jastadd/PrettyPrint.jrag:44
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(ind+"if" + "(");
		getExpr().prettyPrint(out, "");
		out.println(") {");
		for (int i = 0; i < getNumStat(); ++i) {
			getStat(i).prettyPrint(out, ind+"  ");
			out.print("\n");
		}
		out.print(ind+"} ");
		if (hasElse()) {
			getElse().prettyPrint(out, ind);
		}
	}
  /**
   * @aspect Visitor
   * @declaredat /home/john/SimpliC/src/jastadd/Visitor.jrag:41
   */
  public Object accept(Visitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }
  /**
   * @declaredat ASTNode:1
   */
  public If() {
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
    children = new ASTNode[3];
    setChild(new List(), 1);
    setChild(new Opt(), 2);
  }
  /**
   * @declaredat ASTNode:15
   */
  public If(Expr p0, List<Stat> p1, Opt<Else> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:25
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public If clone() throws CloneNotSupportedException {
    If node = (If) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public If copy() {
    try {
      If node = (If) clone();
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
   * @declaredat ASTNode:57
   */
  @Deprecated
  public If fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:67
   */
  public If treeCopyNoTransform() {
    If tree = (If) copy();
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
   * @declaredat ASTNode:87
   */
  public If treeCopy() {
    If tree = (If) copy();
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
   * @declaredat ASTNode:101
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
  /**
   * Replaces the optional node for the Else child. This is the <code>Opt</code>
   * node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   */
  public void setElseOpt(Opt<Else> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   */
  public void setElse(Else node) {
    getElseOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Else getElse() {
    return (Else) getElseOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Else child. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * @return The optional node for child the Else child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Else")
  public Opt<Else> getElseOpt() {
    return (Opt<Else>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Else. This is the <code>Opt</code> node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   */
  public Opt<Else> getElseOptNoTransform() {
    return (Opt<Else>) getChildNoTransform(2);
  }
/** @apilevel internal */
protected java.util.Set localLookup_String_Object_visited;
  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:28
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="/home/john/SimpliC/src/jastadd/NameAnalysis.jrag:28")
  public IdDecl localLookup(String name, Object o) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(o);
    if (localLookup_String_Object_visited == null) localLookup_String_Object_visited = new java.util.HashSet(4);
    if (localLookup_String_Object_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute If.localLookup(String,Object).");
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
    Type expectedType_value = boolType();
    expectedType_visited = false;
    return expectedType_value;
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
    boolean typeOk_value = compatibleType(getExpr().Type());
    typeOk_visited = false;
    return typeOk_value;
  }
  /**
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:126
   * @apilevel internal
   */
  public String Define_flable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getStatListNoTransform()) {
      // @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:129
      int index = _callerNode.getIndexOfChild(_childNode);
      return flable()+""+index;
    }
    else {
      return getParent().Define_flable(this, _callerNode);
    }
  }
  protected boolean canDefine_flable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:125
   * @apilevel internal
   */
  public String Define_lable(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getExprNoTransform()) {
      // @declaredat /home/john/SimpliC/src/jastadd/CodeGen.jrag:130
      return flable()+"else";
    }
    else {
      return getParent().Define_lable(this, _callerNode);
    }
  }
  protected boolean canDefine_lable(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:3
   * @apilevel internal
   */
  public IdDecl Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name, Object o) {
    if (_callerNode == getStatListNoTransform()) {
      // @declaredat /home/john/SimpliC/src/jastadd/NameAnalysis.jrag:7
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
