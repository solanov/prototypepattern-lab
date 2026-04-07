public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // Clone and customize a sheep
        Animal clonedSheep1 = registry.createSheep("Dolly");
        Animal clonedSheep2 = registry.createSheep("Shaun");

        // Clone a cow and a horse
        Animal clonedCow = registry.createCow();
        
        Animal clonedHorse = registry.createHorse();

        ((Horse) clonedHorse).setColor("Black");

        // Test the cloned objects
        System.out.println("Sheep generated: " + clonedSheep1);
        clonedSheep1.makeSound();

       System.out.println("Sheep generated: " + clonedSheep2);
        clonedSheep2.makeSound();

        System.out.println("Cow generated: " + clonedCow);
        clonedCow.makeSound();

        System.out.println("Horse generated: " + clonedHorse);
        clonedHorse.makeSound();
    }
}