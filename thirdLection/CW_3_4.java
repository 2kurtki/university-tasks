package thirdLection;
import java.util.Scanner;

public class CW_3_4 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        System.out.println("Enter the text:");
        sb.append(in.nextLine());

        while (true) {

            System.out.println("Do you want to repeat? (y/n)");
            String answer = in.nextLine();

            if ( !(answer.equals("y") | answer.equals("n")) ){
                System.out.println("Wrong answer. Try again.");
                continue;
            }else if ( answer.equals("n") ){
                break;
            }

            System.out.println("Enter the text:");
            sb.append(in.nextLine());
            counter++;
        }

        String str = sb.toString();
        System.out.println("Text: " + str);
        System.out.println("Text length: " + str.length());
        System.out.println("Number of inputs: " + counter);
    }
}
