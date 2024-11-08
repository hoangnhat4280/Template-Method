package TemplateMethod;

abstract class CoffeeTemplate {
    // Phương thức chung
    public final void prepareCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    abstract void brewCoffeeGrinds();
    abstract void addCondiments();

    // Các phương thức chung cho tất cả đồ uống
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
