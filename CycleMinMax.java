import java.util.Scanner;

/*
4.5 Минимум из введенных чисел
*/

public class CycleMinMax {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (screen.hasNextInt()) {
            int x = screen.nextInt();
            if (x < min)
                min = x;

        }

        System.out.println(min); //если в начале ввести не числовое, выводит максимальное значение (Integer.MAX_VALUE)
    }
}
