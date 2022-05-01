import java.util.Scanner;

/**
 * 4. 9 Площадь круга
 * Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
 * Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
 * Результатом должно стать целое число (тип int). Для этого нужно привести к типу int
 * результат умножения (отбросить дробную часть, округлив вниз до целого числа).
 * В качестве значения pi используй 3.14.
 */
public class CycleAreaCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int radius = kb.nextInt(); //5 = 78
        double pi = 3.14;
        int S = (int) (pi * radius * radius); //округляет вниз
        System.out.println(S);
    }
}
