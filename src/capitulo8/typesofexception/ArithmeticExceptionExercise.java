package capitulo8.typesofexception;

class ArithmeticExceptionExercise {
    public static void main(String[] args) {
        int num1;
        int num2;
        try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("Try finished.");
        } catch (ArithmeticException e) {
            System.out.println("It should not be divided by zero.");
        }  catch (Exception e) {
            System.out.println("An exception has ocurred.");
        }
        System.out.println("Try-catch has finished.");

    }
}
