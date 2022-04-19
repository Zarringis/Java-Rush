public class CycleRectangle {

    /*
4. 3 Незаполненный прямоугольник
*/
    public static void main(String[] args) {
        int a = 1; //нужен один цикл
        while (a > 0) {
            int d = 20; // 1 строчка сплошная
            while (d > 0) {
                System.out.print('Б');
                d--;
            }

            System.out.println();

            int b = 8; // 8 строчек с пробелом по середине
            while (b > 0) {
                System.out.println("Б                  Б");
                b--;
            }

            int c = 20; //повторение 1-го цикла внутри цикла
            while (c > 0) {
                System.out.print('Б');
                c--;
            }
            a--;
            System.out.println();
        }
    }
}
