public class Sheep implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Animal clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}