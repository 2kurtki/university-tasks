package firstLection;

class FifthTask {

    public static void main (String[] args){

        int[] firstArr = { 1, 4, 6, 3 };
        int[] secondArr = { 4, 7, 6, 2 };

        for (int i = 0; i < (firstArr.length); i++){

            if (firstArr[i] != secondArr[i]){
                System.out.println("( " + firstArr[i] + ", " + secondArr[i] + " )");
            }
        }
    }
}
