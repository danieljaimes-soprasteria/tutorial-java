package capitulo6.varargs;

public class VarargsDemo {
    /**
     * Método que devuelve el mayor de los números recibidos como parámetro
     */
    public static void printMax(double... numbers) {
        /**
         * En caso de que no haya parámetros, se imprimirá por pantalla "No argument passed"
         */
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    public static void main(String[] args) {
        /**
         * Se llama al método dos veces con diferentes parámetros
         */
        VarargsDemo.printMax(34, 3, 3, 2, 56.5);
        VarargsDemo.printMax(1, 2, 3);
    }
}
