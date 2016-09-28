package lang;

import lang.ast.*;

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */
public abstract class TraversingVisitor implements lang.ast.Visitor
{

    protected Object visitChildren(ASTNode node, Object data)
    {
        for (int i = 0; i < node.getNumChild(); ++i)
        {
            node.getChild(i).accept(this, data);
        }
        return data;
    }

    public Object visit(List node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(Opt node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(Program node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(Func node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(Stat node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(If node, Object data)
    {
        return visitChildren(node, data);
    }
    public Object visit(While node, Object data)
    {
        return visitChildren(node, data);
    }
}

