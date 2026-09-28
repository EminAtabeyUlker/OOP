import java.util.Map;

class InventorySnapshot {
    private final Map<String, Long> quantities;

    InventorySnapshot(Map<String, Long> quantities) {
        this.quantities = Map.copyOf(quantities);
    }

    long available(String componentCode) {
        return quantities.getOrDefault(componentCode, 0L);
    }
}

class MaterialPlanner {
    void showWoodStock(InventorySnapshot stock) {
        System.out.println(
                "Planner sees WOOD-A: "
                        + stock.available("WOOD-A")
        );
    }
}

public class Exercise5_partA {
    public static void main(String[] args) {
        InventorySnapshot stock =
                new InventorySnapshot(
                        Map.of("WOOD-A", 3000L)
                );

        MaterialPlanner planner =
                new MaterialPlanner();

        planner.showWoodStock(stock);
    }
}
