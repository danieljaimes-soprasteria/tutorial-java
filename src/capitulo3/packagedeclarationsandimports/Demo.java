package capitulo3.packagedeclarationsandimports;

import capitulo3.packagedeclarationsandimports.letmecalculate.Calculator;

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(100, 200));
    }
}
