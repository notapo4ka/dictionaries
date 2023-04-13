package coffee.order;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static Map<Integer, String> order = new HashMap<>();

    public static Map<Integer, String> getOrder() {
        return order;
    }
}