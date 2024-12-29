package main.symbolTable.items;

import main.ast.nodes.declaration.ActorDec;
import main.ast.nodes.declaration.ObserveHandler;

public class ObserveHandlerItem extends SymbolTableItem {
    public static final String START_KEY = "ObserveHandler_";

    private ObserveHandler observeHandler;

    public ObserveHandlerItem(ObserveHandler observeHandler) {
        this.observeHandler = observeHandler;
    }

    @Override
    public String getKey() {
        return START_KEY + this.observeHandler.getName().getName();
    }
}
