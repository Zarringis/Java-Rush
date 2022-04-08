import java.util.Scanner;

public class CycleLove {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner gui = new Scanner(System.in);
        String name = gui.nextLine();
        int y = 10;
        while (y > 0) {
            System.out.println(name + text);
            y--;
        }

    }


}


