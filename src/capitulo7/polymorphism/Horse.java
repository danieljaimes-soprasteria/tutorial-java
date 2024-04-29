package capitulo7.polymorphism;
public class Horse extends Animal{
    @Override
    public String getSound(){
        return "Neigh";
    }
    public static void main(String args[]){
        Animal animal = new Horse();
        Horse horse = (Horse) animal;
        horse.displayInformation();
    }
}
