package capitulo3.creatingobjetcs;

public class Puppy {
    /*
     * Constructor vacío
     */
    public Puppy() {
    }

    /*
     * Constructor con un parámetro de tipo String llamado name
     */
    public Puppy(String name) {
        System.out.println("Passed Name is :" + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy( "tommy" );
    }
}
