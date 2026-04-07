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

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public Animal clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    // NEW: Override toString() to print attributes
    @Override
    public String toString() {
        return "Horse [legs=" + legs + ", sound=" + sound + ", food=" + food + ", color=" + color + "]";
    }
}