package capitulo8.typesofexception;

public class NullPointerExceptionExercise {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("The object is null.");
        }

    }
}
