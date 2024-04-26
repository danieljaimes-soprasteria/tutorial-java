package capitulo6.passingdataamongmethods;

public class PassingDataAmongMethods {
    public static void main(final String[] args) {
        /**
         * Se crea una variable de tipo String con el valor "Hello!"
         */
        String s1 = "Hello!";

        /**
         * Se llama al método bye y se le pasa s1 como parámetro
         */
        bye(s1);

        /**
         * Se imprime en la consola el valor de s1, que será
         * Hello!
         * Esto se debe a que a pesar de que en el método bye
         * hay una variable que se llama s1, es una variable
         * de ámbito local completamente diferente a la variable
         * s1 creada en el método main.
         */
        System.out.println(s1);

        /**
         * Se crea una variable de tipo StringBuilder
         */
        StringBuilder s2 = new StringBuilder();

        /**
         * Se llama al método goodMorning y se le pasa s2 como parámetro
         */
        goodMorning(s2);

        /**
         * Se imprime en la consola el valor de s1, que será
         * Good Morning
         * Esto se debe a que s sí que es el mismo objeto que
         * se le pasa como parámetro.
         */
        System.out.println(s2);
    }

    public static void bye(String s1) {
        s1 = "Bye!";
    }

    public static void goodMorning(StringBuilder s) {
        s.append("Good Morning");
    }

}
