class Plant extends Organism {
    private String species;

    public Plant(String name, float age, String species) {
        super(name, age);
        this.species = species;
    }


    void action() {
        System.out.println(name + " фотоцинтезирует");
    }

    public void bloom() {
        System.out.println(name + " расцветает");
    }
}