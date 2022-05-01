import java.util.Scanner;

/**
 * 4. 10 Скорость ветра
 * Конвертируем величину скорости ветра из м/с в км/ч.
 * Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
 * Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
 * Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
*/
 public class CycleMathRound {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int speed = kb.nextInt();
        int speedkm = (int) Math.round(speed * 3.6);
        System.out.println(speedkm); //округление до ближайщего целого
    }
}
