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

    // NEW: Copy Constructor
    public Sheep(Sheep source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
        this.name = source.name;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setLegs(Integer legs){ this.legs=legs; }
    public Integer getLegs(){ return legs; }
    public void setSound(String sound){ this.sound=sound; }
    public String getSound(){ return sound; }
    public void setFood(String food){ this.food=food; }
    public String getFood(){ return food; }

    @Override
    public Animal clone() {
        // Use the copy constructor instead of super.clone()
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Sheep says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public String toString() {
        return "Sheep [legs=" + legs + ", sound=" + sound + ", food=" + food + ", name=" + name + "]";
    }
}