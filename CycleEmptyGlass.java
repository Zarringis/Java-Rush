import java.util.Scanner;

/**
 * 4. 10 Стакан наполовину пуст или наполовину полон?
 * В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан. Для пессимиста он наполовину пуст,
 * а для оптимиста - наполовину полон. Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean()
 * объекта типа Scanner. В зависимости от полученных данных, округлить переменную glass: до целого числа вниз (0),
 * если пессимист (false) и до целого числа вверх (1), если оптимист (true).
 */
public class CycleEmptyGlass {
    //В ПРОЦЕССЕ решения
    public static void main(String[] args) {
        double glass = 0.4;
        Scanner kb = new Scanner(System.in);
        boolean optimist = kb.nextBoolean();
        int opt = (int) Math.ceil(glass);
        int piss = (int) Math.floor(glass);

        if (true)
        System.out.println(opt);
        else
        System.out.println(piss);
    }
}