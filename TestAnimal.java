public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Clone and customize a sheep
        Animal clonedSheep1 = registry.createSheep("Dolly");
        Animal clonedSheep2 = registry.createSheep("Shaun");

        // Clone a cow and a horse
        Animal clonedCow = registry.createCow();
        Animal clonedHorse = registry.createHorse();

        // Test the cloned objects
        System.out.println("Created: " + clonedSheep1.getType() + " named " + ((Sheep)clonedSheep1).getName());
        clonedSheep1.makeSound();

        System.out.println("\nCreated: " + clonedSheep2.getType() + " named " + ((Sheep)clonedSheep2).getName());
        clonedSheep2.makeSound();

        System.out.println("\nCreated: " + clonedCow.getType());
        clonedCow.makeSound();

        System.out.println("\nCreated: " + clonedHorse.getType());
        clonedHorse.makeSound();
    }
}