package thirdLection;
import java.util.Scanner;

public class CW_3_3 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("Enter the command:");

        repeatingCycle: while (true){

            String commandExpression = in.nextLine();
            String[] words = commandExpression.split(" ");
            String command = words[0];
            String str = commandExpression.replace(command, "").trim();

            switch(command){

                case("length"):
                   System.out.println(operations.length(str));
                   break;
                case("hash"):
                   System.out.println(operations.hash(str));
                   break;
                case("reverse"):
                    System.out.println(operations.reverse(str));
                    break;
                case("substring"):
                    int beginIndex = Character.getNumericValue(str.charAt(0));
                    int endIndex = Character.getNumericValue(str.charAt(2));
                    str = str.substring(4);

                    System.out.println(operations.substring(beginIndex, endIndex, str));
                    break;
                case("exit"):
                    break repeatingCycle;
                default:
                    System.out.println("Wrong command. Try again.");
            }
        }
    }
}

class Operations{

    int length(String str){

        return str.length();
    }

    int hash(String str){

        return str.hashCode();
    }

    String reverse(String str){

        int length = str.length();
        char[] charsArr = str.toCharArray();
        char[] resultArr = new char[length];

        for (int i = 0; i < length; i++){

            resultArr[i] = charsArr[(length - 1) - i];
        }

        return new String(resultArr);
    }

    String substring(int beginIndex, int endIndex, String str){

        return str.substring(beginIndex, endIndex);
    }
}
