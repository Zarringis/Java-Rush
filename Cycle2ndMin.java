import java.util.Scanner;

/*
4. 5 Второе минимальное число из введенных
*/

public class Cycle2ndMin {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        while (screen.hasNextInt()) {
            int x = screen.nextInt();
            if (x < min) {
                if (min < min2)
                    min2 = min;
                min = x;
            } else if (x < min2 && x > min)
                min2 = x;
            //System.out.println("min = " + min + " min2 = " + min2);  проверка с спомощью Print (не дэбаг)
        }
        System.out.println(min2);
    }
}
