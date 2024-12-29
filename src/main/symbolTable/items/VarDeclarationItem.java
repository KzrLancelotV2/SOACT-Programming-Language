package main.symbolTable.items;

import main.ast.nodes.declaration.RecordNode;
import main.ast.nodes.declaration.VarDeclaration;

public class VarDeclarationItem extends SymbolTableItem {
    public static final String START_KEY = "VarDeclaration_";

    private VarDeclaration varDeclaration;

    public VarDeclarationItem(VarDeclaration varDeclaration) {
        this.varDeclaration = varDeclaration;
    }

    @Override
    public String getKey() {
        return START_KEY + this.varDeclaration.getName().getName();
    }
}
