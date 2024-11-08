package TemplateMethod;

class Tea extends CoffeeTemplate {
    @Override
    void brewCoffeeGrinds() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
