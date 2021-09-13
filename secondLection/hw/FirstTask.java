package secondLection.hw;

import java.util.Scanner;

class FirstTask {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the model: ");
        String model = in.nextLine();
        int[] features = new int[2];
        int counter;

        for (counter = 0; counter <= 1; counter++){

            System.out.println("Do you want to continue entering? (y/n)");
            String answer = in.next();

            if ( !(answer.equals("y") | answer.equals("n")) ){
                System.out.println("Wrong input. Try again.");
                counter--;
                continue;
            }else if( answer.equals("n") ){
                break;
            }

            String phrase = (counter == 0) ? "Enter the maxSpeed: " : "Enter the weight: ";
            System.out.print(phrase);
            features[counter] = in.nextInt();
        }

        switch (counter){
            case 2:
                new Car(model, features[0], features[1]).show();
                break;
            case 1:
                new Car(model, features[0]).show();
                break;
            default:
                new Car(model).show();
                break;
        }
    }
}

class Car {

    private String model;
    private int maxSpeed;
    private int weight;

    Car(String model){
        this.model = model;
    }
    Car(String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    Car(String model, int maxSpeed, int weight){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    void show(){

        System.out.println("Model: "  + this.model);
        if (maxSpeed != 0) {
            System.out.println("MaxSpeed: " + this.maxSpeed);
            if (weight != 0) {
                System.out.println("Weight: " + this.weight);
            }
        }
    }
}
