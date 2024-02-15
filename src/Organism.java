abstract class Organism {
    protected String name;
    protected float age;

    public Organism(String name, float age) {
        this.name = name;
        this.age = age;
    }

    abstract void action();

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возсраст: " + age);
    }
}