package thirdLection;

public class HW_3_3 {

    public static void main(String[] args){

        String firstStr = "something";
        long startTimestamp = System.currentTimeMillis();

        for (int i = 1; i <= 20000; i++){

            firstStr = firstStr.concat("somewhere");
        }

        long endTimestamp = System.currentTimeMillis();
        long difference = endTimestamp - startTimestamp;
        System.out.println("Difference in time: " + difference);

        StringBuilder firstSb = new StringBuilder("something");
        startTimestamp = System.currentTimeMillis();

        for (int i = 1; i <= 20000; i++) {

            firstSb.append("somewhere");
        }

        endTimestamp = System.currentTimeMillis();
        difference = endTimestamp - startTimestamp;
        System.out.println("Difference in time: " + difference);
    }
}
