package coffee.order;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static coffee.order.Order.order;

public class CoffeeOrderBoard {

    int naturalOrderNumber;

    public CoffeeOrderBoard() {
        naturalOrderNumber = 1;
    }

    public Map<Integer, String> getOrderQueue() {
        return Order.getOrder();
    }

    public void add(String name) {
        Objects.requireNonNull(name, "Input correct [name] parameter!");
        order.put(naturalOrderNumber, name);
        naturalOrderNumber++;
    }

    public String deliver() {
        String result = order.get(1);
        order.remove(1);
        return result;
    }

    public String deliver(int orderNumber) {
        if (!order.containsKey(orderNumber)) {
            throw new IllegalArgumentException("You have to input existing number");
        }
        String result = order.get(orderNumber);
        order.remove(orderNumber);
        return result;
    }

    public void draw() {
        System.out.println("Orders:" + "\n" + "--------------" + "\n" + "Number | Name");
        Set<Integer> keySet = order.keySet();

        for (Integer key : keySet) {
            System.out.println(key + " | " + order.get(key));
        }
    }
}