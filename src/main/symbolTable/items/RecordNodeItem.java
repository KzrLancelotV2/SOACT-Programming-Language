package main.symbolTable.items;

import main.ast.nodes.declaration.RecordNode;
import main.symbolTable.items.SymbolTableItem;

public class RecordNodeItem extends SymbolTableItem {
    public static final String START_KEY = "RecordNode_";

    private RecordNode recordNode;

    public RecordNodeItem(RecordNode recordNode) {
        this.recordNode = recordNode;
    }

    @Override
    public String getKey() {
        return START_KEY + this.recordNode.getId().getName();
    }
}
