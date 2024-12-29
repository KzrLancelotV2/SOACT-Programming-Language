package main.ast.nodes.type;

import main.visitor.IVisitor;

public class SetType extends Type{
    private Type type;
    public SetType(Type type) {
        this.type = type;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) { return visitor.visit(this); }
}
