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

    public void setLegs(Integer legs){
        this.legs=legs;
    }

    public Integer getLegs(){
        return legs;
    }

    public void setSound(String sound){
        this.sound=sound;
    }

    public String getSound(){
        return sound;
    }

    public void setFood(String food){
        this.food=food;
    }

    public String getFood(){
        return food;
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

    // NEW: Override toString() to print attributes
    @Override
    public String toString() {
        return "Sheep [legs=" + legs + ", sound=" + sound + ", food=" + food + ", name=" + name + "]";
    }
}