package firstLection;

import java.util.Scanner;

class FourthTask {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        pickThePoint();

        while (true){

            System.out.println("Do you want to continue? (y/n)");
            String answer = in.next();

            if ( !(answer.equals("y") | answer.equals("n")) ){
                System.out.println("Wrong input. Try again.");
                continue;
            }else if( answer.equals("n") ){
                break;
            }

            pickThePoint();
        }
    }
    static void pickThePoint(){

        double firstPoint = 2.34;
        double secondPoint = 5.76;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        double inputNum = in.nextDouble();

        if (inputNum > firstPoint & inputNum < secondPoint){
            System.out.println("hit the segment!");
        }else{
            System.out.println("off the mark :-(");
        }
    }
}
