package capitulo6.encapsulatingdata;

public class EncapsulatingDataTest {
    public static void main(final String args[]) {
        EncapsulatingData obj = new EncapsulatingData();

        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);

        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }

}
