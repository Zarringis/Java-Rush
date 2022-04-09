import java.util.Scanner;

public class CycleSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean isExit = false;
        int summa = 0;

        while (!isExit){
            String  s = kb.nextLine();
            if (isDigit(s)){
                int num = Integer.parseInt(s);
                summa += num;  //сумма введенных чисел
            }
            else
                isExit = s.equals("ENTER");

        }

        System.out.println(summa);

    }
    //превращает любой символ в число, как отрицательный так и положительный. Изучи его на досуге
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
