package capitulo6.accessmodifiers;

import capitulo6.accessmodifiers.package1.Default;
import capitulo6.accessmodifiers.package1.Protected;
import capitulo6.accessmodifiers.package1.Public;

public class Test extends Protected {
    public static void main(String[] args) {
        Default objDefault = new Default();
        //objDefault.addTwoNumbers(10, 21); //Error de compilación

        Private objPrivate = new Private();
        //double num = objPrivate.num; //Error de compilación
        //objPrivate.square(10); //Error de compilación

        Test obj = new Test();
        /**
         * Se imprime por pantalla el restultado del método .subctractTwoNumbers
         * de la clase Protected.java
         */
        System.out.println(obj.subctractTwoNumbers(20, 10));

        Public objPublic = new Public();
        /**
         * Se imprime por pantalla el restultado del método .divideTwoNumbers
         * de la clase Public.java
         */
        System.out.println(objPublic.divideTwoNumbers(20, 10));

    }
}
