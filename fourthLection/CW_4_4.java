package fourthLection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CW_4_4 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Map<String, Integer> fruitsMap =  new HashMap<>();

        fruitsMap.put("apple", 1);
        fruitsMap.put("orange", 23);
        fruitsMap.put("banana", 45);
        fruitsMap.put("pineapple", 67);

        for (String fruit : fruitsMap.keySet()){

            System.out.println("Key: " + fruit);
        }

        for (int fruitNum : fruitsMap.values()){

            System.out.println("Value: " + fruitNum);
        }

        System.out.print("Enter the key: ");
        String enteredKey = in.next();

        if(fruitsMap.containsKey(enteredKey)){
            System.out.println("Value: " + fruitsMap.get(enteredKey));
        } else {
            System.out.println("There is no such key!");
        }

        System.out.print("Enter the value: ");
        int enteredValue = in.nextInt();

        if(fruitsMap.containsValue(enteredValue)) {

            for (Map.Entry entry : fruitsMap.entrySet()) {

                if (entry.getValue().equals(enteredValue)) {
                    System.out.println("Key: " + entry.getKey());
                }
            }
        } else {
            System.out.println("There is no such value!");
        }
    }
}
