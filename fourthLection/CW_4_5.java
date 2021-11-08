package fourthLection;

import java.util.*;

public class CW_4_5 {

    public static void main(String[] args){

        String[] wordsArr = {"sefwf", "fnkwf", "lkp[[oko"};
        Integer[] numArr = {4, 52, 6, 3342, 78};

        printArray(wordsArr);
        printArray(numArr);

        Collection<String> wordsList = new ArrayList<>(Arrays.asList(wordsArr));
        Queue<Character> charactersQueue = new ArrayDeque<>();

        for(int i = 0; i < 30; i++){
            charactersQueue.offer((char) (Math.random() * 1000));
        }

        printCollection(wordsList);
        printCollection(charactersQueue);
    }

    public static  <T> void printArray(T[] arr){

        for(T elem : arr){
            System.out.print(elem + " ");
        }

        System.out.println();
    }

    public static <T> void printCollection(Collection<T> collection){

        for(T elem : collection){
            System.out.print(elem + " ");
        }

        System.out.println();
    }
}
