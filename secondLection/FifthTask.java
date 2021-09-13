package secondLection;

import java.util.Scanner;

class FifthTask {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = in.nextDouble();
        System.out.print("Enter the power: ");
        double pow = in.nextDouble();
        System.out.println(MathUtils.pow(num, pow));

        System.out.print("Enter the number: ");
        int secondNum = in.nextInt();
        System.out.println(MathUtils.getFactorial(secondNum));
    }
}

class MathUtils{

    static double pow(double num, double power){
        return Math.pow(num, power);
    }

    static int getFactorial(int num){

        int result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }

        return result;
    }
}
