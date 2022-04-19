import java.util.Scanner;

/*
4. 5 Второе минимальное число из введенных
*/

public class Cycle2ndMin {
    //пока не знаю как вывести в минемальное число
    
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (screen.hasNextInt()) {
            int x = screen.nextInt();
            if (x < min)
                min = x;
            if (x > max)
                max = x;
        }

        System.out.println(min);
    }
}
