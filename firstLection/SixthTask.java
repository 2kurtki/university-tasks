package firstLection;

import java.util.Arrays;

class SixthTask {

    public static void main (String[] args){

        char[] firstArr = { 'a', 'f', '3', 't', '7', '2', '8', '5', 'r', '2', 'y', 'g', '0', 'u', 'd' };
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));

        char[] secondArr = new char[firstArr.length - 5];
        System.arraycopy(firstArr, 0, secondArr, 0, 5);
        System.arraycopy(firstArr, 10, secondArr, 5, 5);
        System.out.println(Arrays.toString(secondArr));
    }
}
