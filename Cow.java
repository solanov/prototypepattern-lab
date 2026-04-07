public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
    }

    // NEW: Copy Constructor
    public Cow(Cow source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
    }

    public void setLegs(Integer legs){ this.legs=legs; }
    public Integer getLegs(){ return legs; }
    public void setSound(String sound){ this.sound=sound; }
    public String getSound(){ return sound; }
    public void setFood(String food){ this.food=food; }
    public String getFood(){ return food; }

    @Override
    public Animal clone() {
        // Use the copy constructor instead of super.clone()
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "A " + this.getType() + " has " + legs + " legs. It eats " + food + " and says " + sound;
    }
}