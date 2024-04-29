package capitulo7.abstractclass;

public class Demo extends AbstractDemo {
    public void disp2(){
        System.out.println("overriding abstract method");
    }
    public int sumOfTwo(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args){
        //AbstractDemo obj = new AbstractDemo();
        Demo obj = new Demo();
        obj.disp();
        obj.disp2();
        System.out.println(obj.sumOfTwo(3, 7));

    }
}
