public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Brown";
    }

    // NEW: Copy Constructor
    public Horse(Horse source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
        this.color = source.color;
    }

    public void setLegs(Integer legs){ this.legs=legs; }
    public Integer getLegs(){ return legs; }
    public void setSound(String sound){ this.sound=sound; }
    public String getSound(){ return sound; }
    public void setFood(String food){ this.food=food; }
    public String getFood(){ return food; }
    public void setColor(String color){ this.color=color; }
    public String getColor(){ return color; }

    @Override
    public Animal clone() {
        // Use the copy constructor instead of super.clone()
        return new Horse(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    @Override
    public String toString() {
        return "A "+color +" coloured "+ this.getType() +" has " + legs + " legs. It eats " + food + " and says " + sound;
    }
}