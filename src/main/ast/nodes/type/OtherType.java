package main.ast.nodes.type;

import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class OtherType extends Type{
    private String name;
    public OtherType(String name) {
        this.name = name;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }
}
