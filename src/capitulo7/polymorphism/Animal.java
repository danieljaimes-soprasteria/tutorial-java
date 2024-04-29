package capitulo7.polymorphism;

public class Animal {
    private String n;
    public String getSound(){
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("Animal is making a sound: " + getSound());
    }
}
