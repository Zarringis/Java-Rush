/*
4. 7 Рисуем треугольник (цикл в цикле)
 */

public class CycleForTriangle {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++)  //Цикл по строкам (всего должно быть 10 строк)
        {
            int starCount = 0 + i;   //Вычисляем, сколько в строке должно быть звездочек
            for (int j = 0; j < starCount; j++)  //цикл по звездочкам
                System.out.print("8");
            System.out.println();
        }
    }
}
