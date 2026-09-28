class InventoryService {
    void updateStock() {
        System.out.println("Stock updated");
    }
}

class MaterialPlanner {
    void calculateMaterialNeeds() {
        // Message changed as requested in the final step
        System.out.println("Material requirements calculated");
    }
}

class InvoiceService {
    void createInvoice() {
        System.out.println("Invoice created");
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryService inventory =
                new InventoryService();

        MaterialPlanner planner =
                new MaterialPlanner();

        InvoiceService invoice =
                new InvoiceService();

        inventory.updateStock();
        planner.calculateMaterialNeeds();
        invoice.createInvoice();
    }
}
