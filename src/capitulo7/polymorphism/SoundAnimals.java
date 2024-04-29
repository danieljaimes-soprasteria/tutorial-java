package capitulo7.polymorphism;

public class SoundAnimals {
    public static void sound(Animal animal) {
        System.out.println("Sound Animal: " + animal.getSound());
    }

    public static void main(String[] args) {
        sound(new Cat());
        sound(new Horse());
        sound(new Animal());
    }
}