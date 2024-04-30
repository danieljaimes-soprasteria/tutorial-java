package capitulo8.throwinganexception;

public class TryCatchThrowExceptionExercise {
    private static void fall() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            fall();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        System.out.println("Finished Try-catch.");

    }
}
