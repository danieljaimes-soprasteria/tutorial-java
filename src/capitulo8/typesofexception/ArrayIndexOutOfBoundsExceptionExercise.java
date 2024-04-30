package capitulo8.typesofexception;

public class ArrayIndexOutOfBoundsExceptionExercise {
    public static void main(String[] args) {
        try {
            int[] a = new int[10];
            a[11] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It should not be divided by zero. Try-catch has finished.");
        }

    }
}
