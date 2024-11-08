package TemplateMethod;

class Coffee extends CoffeeTemplate {

    @Override
    void brewCoffeeGrinds() {
        System.out.println("Brewing coffee grounds");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
