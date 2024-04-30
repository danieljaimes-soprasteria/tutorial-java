package capitulo8.throwingruntimeexception;

public class Person {
    private int age;

    public static void main(String[] args) {
        final Person person = new Person();
        person.setAge(-10);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new RuntimeException("Age should be positive.");
        }
        this.age = age;
    }
}