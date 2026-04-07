public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Brown"; // Default color
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
}