import java.util.Scanner;

/*
4. 4 Показываем, что получаем
*/

public class CycleBreak {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) {
            String str = kb.nextLine();
            if (str.equals("enough")) //Прерывает весь цикл спомощью строки "enough"
                break;

        }
    }
}
