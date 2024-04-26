package capitulo6.constructors;

public class Constructors {
    private final int var;

    /**
     * Constructor vacío
     */
    public Constructors() {
        var = 10;
    }

    /**
     * Constructor con parámetros
     */
    public Constructors(int num) {
        var = num;
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        Constructors obj2 = new Constructors(100);
        System.out.println("var is: " + obj.getValue());
        System.out.println("var is: " + obj2.getValue());
    }

    public int getValue() {
        return var;
    }

}
