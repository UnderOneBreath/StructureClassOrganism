class Animal extends Organism {
    private String species;

    public Animal(String name, float age, String species) {
        super(name, age);
        this.species = species;
    }

    void action() {
        System.out.println(name + " Двигается");
    }

    public void makeSound() {
        System.out.println(name + " Рычит");
    }
}