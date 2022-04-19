/*
4. 4 Сумма чисел, не кратных 3
*/

public class CycleSumWithout3 {
    public static void main(String[] args) {
        int q = 0;
        int summa = 0;

        while (q < 100) {
            q++;
            if ((q % 3) == 0) //исключает цифры кратные 3
                continue;   //прерывает текущий виток цикла
            summa += q; //прибавляет цифру q к каждому витку цикла
        }

        System.out.println(summa);
    }
}
