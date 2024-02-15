public class Client {
    public static void main(String[] args) {
        Animal lion = new Animal("Кот", 2, "кошачьих");
        Plant tree = new Plant("Ньургуhун", 0.2F, "Цветы");

        lion.displayInfo();
        lion.action();
        lion.makeSound();

        System.out.println();

        tree.displayInfo();
        tree.action();
        tree.bloom();
    }
}