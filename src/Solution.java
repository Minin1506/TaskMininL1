public class Solution {

    public static void main(String[] args) {

        double a, b, c;
        double D;
        // Код для рандомных переменных

        a = Math.random()*200-100;
        b = Math.random()*200-100;
        c = Math.random()*200-100;
        System.out.println(" Случайная переменная а = " +a);
        System.out.println(" Случайная переменная b = " +b);
        System.out.println(" Случайная переменная c = " +c);


        // Код для пользовательских переменных

       // System.out.println("Введите a, b и с для уравнения: ax^2 +bx +c =0 ");
       // Scanner in = new Scanner(System.in);
       // a = in.nextDouble();
       // b = in.nextDouble();
       // c = in.nextDouble();

        D = b * b - 4 * a * c;
        System.out.println(" Дискриминант = " +D);
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("1й корень= " + x1 + "  2й корень= " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Корень =" + x);
        } else {
            System.out.println("Нет корней/ ");
        }

    }
}



