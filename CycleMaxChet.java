import java.util.Scanner;

/*
4.5 Максимум четное из введенных чисел
*/

public class CycleMaxChet {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int maxChet = Integer.MIN_VALUE;

        while (screen.hasNextInt()) {
            int y = screen.nextInt();
            if ((y > maxChet) && ((y % 2) == 0))
                maxChet = y;
        }

        System.out.println(maxChet); //выводит если отсутствует четное число или введен нечисловой символ (Integer.MIN_VALUE)

    }
}
