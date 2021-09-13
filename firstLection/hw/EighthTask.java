package firstLection.hw;

import java.util.Scanner;

class EighthTask {

    public static void main(String[] args){

        String[] nameArr = { "Jane", "Alex", "Bob", "Tayler" };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String enteredName = in.nextLine();
        boolean isInArray = false;

        for (String name : nameArr){
            if (name.equals(enteredName)){
                System.out.println("Entered name is in the list!");
                isInArray = true;
            }
        }

        if (!isInArray) System.out.println("Entered name isn't in the list");
    }
}
