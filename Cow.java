public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
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
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    // NEW: Override toString() to print attributes
    @Override
    public String toString() {
        return "Cow [legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}