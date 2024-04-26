package capitulo6.exercisehomeexample;

public class Kitchen {
    //Atributos de la clase Kitchen
    private boolean isIndependent;
    private int numberOfStoves;

    //Constructor
    public Kitchen() {
        isIndependent = false;
        numberOfStoves = 0;
    }

    public boolean getIsIndependent() {
        return isIndependent;
    }

    //Metodos getters y setters
    public void setIsIndependent(boolean valueIsIndependent) {
        isIndependent = valueIsIndependent;
    }

    public int getNumberOfStoves() {
        return numberOfStoves;
    }

    public void setNumberOfStoves(int valueNumberOfStoves) {
        numberOfStoves = valueNumberOfStoves;
    }

}
