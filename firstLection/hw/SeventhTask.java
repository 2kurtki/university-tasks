package firstLection.hw;

import java.util.Scanner;

class SeventhTask {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        calculate();

        while (true){

            System.out.println("Do you want to repeat? (y/n)");
            String answer = in.next();

            if ( !(answer.equals("y") | answer.equals("n")) ){
                System.out.println("Wrong answer. Try again.");
                continue;
            }else if ( answer.equals("n") ){
                break;
            }

            calculate();
        }
    }

    static void calculate(){
        Scanner in = new Scanner(System.in);
        double numA;
        double numB;
        System.out.print("Enter the expression: ");
        String expression = in.nextLine();
        String[] symbols = new String[0];
        String operator;

        if (expression.contains("+")) {
            symbols = expression.split("\\+");
            numA = Double.parseDouble(symbols[0].trim());
            numB = Double.parseDouble(symbols[1].trim());
            System.out.println(numA + numB);
        } else if (expression.contains("-")) {
            symbols = expression.split("-");
            numA = Double.parseDouble(symbols[0].trim());
            numB = Double.parseDouble(symbols[1].trim());
            System.out.println(numA - numB);
        } else if (expression.contains("*")) {
            symbols = expression.split("\\*");
            numA = Double.parseDouble(symbols[0].trim());
            numB = Double.parseDouble(symbols[1].trim());
            System.out.println(numA * numB);
        } else if (expression.contains("/")) {
            symbols = expression.split("/");
            numA = Double.parseDouble(symbols[0].trim());
            numB = Double.parseDouble(symbols[1].trim());
            System.out.println(numA / numB);
        } else {
            System.out.println("Wrong input. Try again.");
        }
    }

}
