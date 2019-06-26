public class Solution {

    public static void main(String[] args) {

        double a, b, c;
        double d;
        // Code with random values

        a = Math.random()*100;
        b = Math.random()*100;
        c = Math.random()*100;
        System.out.println(" Random value for а = " +a);
        System.out.println(" Random value for b = " +b);
        System.out.println(" Random value for c = " +c);


        // Code for user's values

        //System.out.println("Enter your values ​​for a, b and с variables : ax^2 +bx +c =0 ");
        //Scanner in = new Scanner(System.in);
        //a = in.nextDouble();
        //b = in.nextDouble();
        //c = in.nextDouble();

        d = b * b - 4 * a * c;
        System.out.println(" Discriminant = " +d);
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("1st root= " + x1 + " 2nd root= " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Root =" + x);
        } else {
            System.out.println("No solutions");
        }

    }
}



