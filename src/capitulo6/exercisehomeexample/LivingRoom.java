package capitulo6.exercisehomeexample;

public class LivingRoom {
    //Atributos de la clase LivingRoom
    private int numberOfTV;
    private String livingRoomType;

    //Constructor
    public LivingRoom() {
        numberOfTV = 0;
        livingRoomType = "Unknown";
    }

    public int getNumberOfTV() {
        return numberOfTV;
    }

    //Metodos getters y setters
    public void setNumberOfTV(int valueNumberOfTV) {
        numberOfTV = valueNumberOfTV;
    }

    public String getLivingRoomType() {
        return livingRoomType;
    }

    public void setLivingRoomType(String valueLivingRoomType) {
        livingRoomType = valueLivingRoomType;
    }

}
