public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Animal sheep = registry.createSheep();
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        ((Sheep) sheep).setName("Dolly"); 
        ((Cow) cow).setSound("Moo!"); 
        ((Horse) horse).setColor("Black"); 

        System.out.println(sheep.toString() + "\n");
        System.out.println(cow.toString() + "\n");
        System.out.println(horse.toString() + "\n");

        Animal sheep2 = registry.createSheep();
        ((Sheep) sheep2).setName("Molly"); 
        System.out.println(sheep2.toString() + "\n");

        Animal cow2 = registry.createCow();
        ((Cow) cow2).setFood("Corn"); 
        ((Cow) cow2).setSound("Maa!"); 
        System.out.println(cow2.toString() + "\n");

        Animal horse2 = registry.createHorse();
        ((Horse) horse2).setColor("Brown"); 
        ((Horse) horse2).setSound("NAEEEEE!!!!"); 
        System.out.println(horse2.toString() + "\n");
    }
}