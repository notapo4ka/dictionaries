package coffee.order;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoard coffee = new CoffeeOrderBoard();
        coffee.add("Dima");
        System.out.println(Order.getOrder());
        coffee.add("Sasha");
        System.out.println(Order.getOrder());
        coffee.add("Alex");
        System.out.println(Order.getOrder());

        System.out.println();

        System.out.println("Coming order - " + coffee.deliver());

        System.out.println();

        System.out.println("Order ready - " + coffee.deliver(3));
        System.out.println(Order.getOrder());

        System.out.println();

        coffee.add("Nik");
        coffee.draw();
    }
}