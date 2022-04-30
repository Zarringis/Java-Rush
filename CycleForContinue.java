import java.util.Scanner;

/**
 * 4. 6 Сумма кратных чисел
 * В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
 * На экран выводится сумма чисел от start (включительно) до end (не включительно), кратных multiple.
 */
public class CycleForContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int y = start; y < end; y++) {
            if (y % multiple != 0) //исключает цифры не кратные 3
                continue;
            //System.out.println(y);  (1, 30, 3 test number)
            sum += y;
        }

        System.out.println(sum);
    }
}
