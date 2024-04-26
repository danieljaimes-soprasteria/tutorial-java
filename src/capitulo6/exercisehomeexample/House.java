package capitulo6.exercisehomeexample;

public class House {
    //Atributos de la clase House
    public static double area;
    public static String address;
    public static LivingRoom livingRoom;
    public static Kitchen kitchen;

    public House() {
        area = 0.0d;
        address = "Unknown";
        livingRoom = new LivingRoom();
        kitchen = new Kitchen();
    }

    public static LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom valueLivingRoom) {
        livingRoom.setNumberOfTV(valueLivingRoom.getNumberOfTV());
        livingRoom.setLivingRoomType(valueLivingRoom.getLivingRoomType());
    }

    public static Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen valueKitchen) {
        kitchen.setIsIndependent(valueKitchen.getIsIndependent());
        kitchen.setNumberOfStoves(valueKitchen.getNumberOfStoves());
    }

    public static void main(String[] args) {
        House house = new House();
        String message = "House area: " + area + "\n";
        message = message + "House address: " + address + ".\n";
        message = message + "Let's go inside the house:\n";
        message = message + "The house has a livingroom of type " + getLivingRoom().getLivingRoomType() + " and with " + getLivingRoom().getNumberOfTV() + " TV's \n";
        message = message + "The house has a kitchen has " + getKitchen().getNumberOfStoves() + " stoves and the kitchen is " + getKitchen().getIsIndependent() + " independent \n";
        message = message + "\n\n\tEnd!";
        System.out.println(message);
    }

    public double getArea() {
        return area;
    }

    //Metodos getters y setters
    public void setArea(double valueArea) {
        area = valueArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String valueAddress) {
        address = valueAddress;
    }

}
