package capitulo7.polymorphism;
public class Cat extends Animal{
    @Override
    public String getSound(){
        return "Meow";
    }

    public static void main(String[] args){
        Animal cat = new Cat();
        cat.displayInformation();
    }

}