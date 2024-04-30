package capitulo8.throwinganexception;
public class Person {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if (age <= 0) {
            throw new Exception("Age should be positive.");
        }
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            final Person person = new Person();
            person.setAge(-10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}