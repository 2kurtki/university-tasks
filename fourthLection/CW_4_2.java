package fourthLection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class CW_4_2 {

    public static void main(String[] args){

        String sourceStr = "Java is a programming language that is concurrent, class based and object-oriented.";
        String[] unsortedWordsArr =  sourceStr.split("[ ,.]");
        TreeSet<String> wordsSet = new TreeSet<>(Arrays.asList(unsortedWordsArr));

        Iterator<String> it = wordsSet.iterator();
        while(it.hasNext()) {

            if(it.next().length() <= 3){
                it.remove();
            }
        }

        System.out.println(wordsSet);
    }
}
