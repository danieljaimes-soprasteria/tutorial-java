package capitulo8.trycatchfinally;

public class TryCatchFinallyExercise2 {
    private static void fall() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            fall();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException.");
        } finally {
            System.out.println("I'm finishing.");
        }
        System.out.println("Finished Try-catch.");
    }

}
