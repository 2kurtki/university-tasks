package fourthLection;

import java.util.ArrayDeque;
import java.util.Queue;

public class CW_4_3 {

    public static void main(String[] args){

        Queue<Character> charactersQueue = new ArrayDeque<>();

        for(int i = 0; i < 30; i++){
            charactersQueue.offer((char) (Math.random() * 1000));
        }

        System.out.println(charactersQueue.poll());
        System.out.println(charactersQueue.poll());
        System.out.println(charactersQueue.peek());
    }
}
