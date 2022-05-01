import java.util.Scanner;

/**
 * 4. 9 Share a Coke
 * Разделить ящик колы на кабинет программистов.
 * Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
 * Второе - количество людей в кабинете.
 * Вывести на экран результат деления первого числа на второе.
 * Результатом должно быть вещественное число
 */
public class CycleShare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int kan = kb.nextInt();
        int cabinet = kb.nextInt();
        System.out.println(kan * 1.0 / cabinet); //деление с остатком, преобразование целых чисел в дробные
    }
}
