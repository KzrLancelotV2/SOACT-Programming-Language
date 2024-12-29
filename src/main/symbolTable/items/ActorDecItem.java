package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.declaration.RecordNode;
import main.symbolTable.items.SymbolTableItem;

public class ActorDecItem extends SymbolTableItem {
    public static final String START_KEY = "ActorDec_";

    private ActorDec actorDec;

    public ActorDecItem(ActorDec actorDec) {
        this.actorDec = actorDec;
    }

    @Override
    public String getKey() {
        return START_KEY + this.actorDec.getName().getName();
    }
}
