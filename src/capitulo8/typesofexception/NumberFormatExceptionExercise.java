package capitulo8.typesofexception;

public class NumberFormatExceptionExercise {
    public static void main(String[] args) {
        try{
            int num= Integer.parseInt ("XYZ") ;
            System.out.println(num);
        } catch(NumberFormatException e){
            System.out.println("The XYZ value can not be converted to Integer type.");
        }

    }
}
