public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        // Initialize the prototypes
        sheepPrototype = new Sheep();
        cowPrototype = new Cow();
        horsePrototype = new Horse();
    }

    public Animal createSheep(String name) {
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.setName(name); // Customize the clone
        return clonedSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}