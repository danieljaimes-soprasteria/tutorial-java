package capitulo6.overloadingmethods;

public class OverloadingMethods {
    public static void main(String[] args) {
        OverloadingMethods obj = new OverloadingMethods();
        obj.disp('a');
        obj.disp('a', 10);
        obj.disp(2);
        obj.disp(10, 'a');
    }

    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }

    public void disp(int c) {
        System.out.println(c);
    }

    public void disp(int num, char c) {
        System.out.println(num + " " + c);
    }

}
