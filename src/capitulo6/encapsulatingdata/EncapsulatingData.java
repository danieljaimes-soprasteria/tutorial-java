package capitulo6.encapsulatingdata;

public class EncapsulatingData {
    /**
     * Propiedades de la clase EncapsulatingData
     */
    private int ssn;
    private String empName;
    private int empAge;

    /**
     * Métodos getterss y setterss
     */
    public int getEmpSSN() {
        return ssn;
    }

    public void setEmpSSN(int newValue) {
        ssn = newValue;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

}
