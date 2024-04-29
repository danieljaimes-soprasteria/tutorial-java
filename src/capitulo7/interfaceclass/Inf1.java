package capitulo7.interfaceclass;

interface Inf1 {
    public void method1();
}

interface Inf2 extends Inf1 {
    default void newMethod(){
        System.out.println("Newly added default method");
    }
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }
    public void method2();
}

interface Inf3{}
class Demo implements Inf2,Inf3{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String[] args){
        Inf2 obj = new Demo();
        obj.newMethod();
        Inf2.anotherNewMethod();
        obj.method1();
        obj.method2();
    }
}
