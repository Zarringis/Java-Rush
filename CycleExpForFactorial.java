/*
4. 7 Пример, вычисление факториала с помощью FOR
*/

public class CycleExpForFactorial {
    public static void main(String[] args) {
        int f = 1;                     //В переменной f будем хранить произведение чисел
        for (int i = 1; i <= 10; i++)  //Цикл от 1 до 10 (включительно)
            f = f * i;                 //Умножаем f на очередное число (результат сохраняем в f)
        System.out.println(f);         //Выводим факториал
    }
}
