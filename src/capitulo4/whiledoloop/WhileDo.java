package capitulo4.whiledoloop;

public class WhileDo {
    public static void main(String args[]) {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);
        int arr[] = {2, 11, 45, 9};
        int y = 0;
        do {
            System.out.println("pos " + y + ": " + arr[y]);
            y++;
        } while (y < 4);
    }

}
