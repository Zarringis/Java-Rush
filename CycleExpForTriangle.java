/*
4. 7 Пример, рисуем треугольник с помощью FOR
 */

public class CycleExpForTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)  //Цикл по строкам (всего должно быть 10 строк)
        {
            int starCount = 10 - i;   //Вычисляем, сколько в строке должно быть звездочек
            for (int j = 0; j < starCount; j++)  //цикл по звездочкам
                System.out.print("*"); //Сама отрисовка
            System.out.println();      // перенос строки
        }
    }
}
