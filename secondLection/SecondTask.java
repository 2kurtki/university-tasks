package secondLection;
import java.util.Scanner;

class SecondTask {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        Roots firstExample = getRoots(a, b, c);
        System.out.println(Roots.value);
        System.out.println(firstExample.x1);
    }

    static class Roots {

        double x1;
        double x2;
        static int value = 0;

        Roots(){

        }

        Roots(double x1, double x2){
            this.x1 = x1;
            this.x2 = x2;
            value++;
        }

    }

    static Roots getRoots(int a, int b, int c){
        double discriminant = b*b - 4*a*c;
        if (discriminant < 0) {
            System.out.println("No roots.");
            return new Roots();
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2*a);
        return new Roots(x1, x2);
    }
}

