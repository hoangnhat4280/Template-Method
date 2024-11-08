package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Coffee và gọi phương thức prepareCoffee
        CoffeeTemplate coffee = new Coffee();
        System.out.println("Preparing coffee:");
        coffee.prepareCoffee(); // Quy trình pha cà phê

        System.out.println("\nPreparing tea:");
        // Tạo đối tượng Tea và gọi phương thức prepareCoffee
        CoffeeTemplate tea = new Tea();
        tea.prepareCoffee();  // Quy trình pha trà
    }
}

