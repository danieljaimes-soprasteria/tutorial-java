package capitulo7.inheritance;

public class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("Constructor of Child");
    }

    public ChildClass(int age) {
        super("Child", age);
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        ChildClass child2 = new ChildClass(5);
        child.disp();
        child2.disp2();
    }

    void disp() {
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }

    void disp2() {
        System.out.println(super.name + " is " + this.age + " years old");
    }
}
