package firstLection;

import java.util.Scanner;

class ThirdTask {

    public static void main (String[] args){

        double firstPoint = 2.34;
        double secondPoint = 5.76;
        Scanner in = new Scanner(System.in);
        double inputNum = in.nextDouble();

        if (inputNum > firstPoint & inputNum < secondPoint){
            System.out.println("hit the segment!");
        }else{
            System.out.println("off the mark :-(");
        }
    }
}
