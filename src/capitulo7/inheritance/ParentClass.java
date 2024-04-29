package capitulo7.inheritance;

public class ParentClass {
    protected String name;
    protected int age;
    ParentClass() {
        System.out.println("Constructor of Parent");
    }
    ParentClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    void disp(){
        System.out.println("Parent Method");
    }

}
