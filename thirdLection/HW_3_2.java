package thirdLection;

import java.util.Scanner;

public class HW_3_2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();

        String[] wordsArr = str.split(" ");
        System.out.println("Number of words: " + wordsArr.length);

        int charAmount = str.replace(" ", "").length();
        System.out.println("Number of chars: " + charAmount);

        String theBiggestWord = wordsArr[0];

        for (String word : wordsArr){

            if (word.length() > theBiggestWord.length()) theBiggestWord = word;
        }

        System.out.println("The biggest word: " + theBiggestWord);
    }
}
