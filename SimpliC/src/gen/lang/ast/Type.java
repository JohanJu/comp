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
 * @declaredat /home/john/SimpliC/src/jastadd/lang.ast:4
 * @production Type : {@link ASTNode} ::= <span class="component">&lt;String:String&gt;</span>;

 */
public abstract class Type extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Type() {
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
  public Type(String p0) {
    setString(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Type(beaver.Symbol p0) {
    setString(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 0;
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
  public Type clone() throws CloneNotSupportedException {
    Type node = (Type) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:42
   */
  @Deprecated
  public abstract Type fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract Type treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract Type treeCopy();
  /**
   * Replaces the lexeme String.
   * @param value The new value for the lexeme String.
   * @apilevel high-level
   */
  public void setString(String value) {
    tokenString_String = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_String;
  /**
   */
  public int Stringstart;
  /**
   */
  public int Stringend;
  /**
   * JastAdd-internal setter for lexeme String using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme String
   * @apilevel internal
   */
  public void setString(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setString is only valid for String lexemes");
    tokenString_String = (String)symbol.value;
    Stringstart = symbol.getStart();
    Stringend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme String.
   * @return The value for the lexeme String.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="String")
  public String getString() {
    return tokenString_String != null ? tokenString_String : "";
  }
}