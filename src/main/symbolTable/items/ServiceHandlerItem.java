package main.symbolTable.items;

import main.ast.nodes.declaration.ServiceHandler;

public class ServiceHandlerItem extends SymbolTableItem {
    public static final String START_KEY = "ServiceHandler_";

    private ServiceHandler serviceHandler;

    public ServiceHandlerItem(ServiceHandler serviceHandler) {
        this.serviceHandler = serviceHandler;
    }

    @Override
    public String getKey() {
        return START_KEY + this.serviceHandler.getName().getName();
    }
}
