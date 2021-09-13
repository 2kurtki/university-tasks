package firstLection;

class FirstTask {

    public static void main (String[] args){

        String a = "78";
        String b = "78.4";
        int x = stringToInt(a);
        double y = stringToDouble(b);
        System.out.println(x);
        System.out.println(y);

        int z = (int)Math.round(y);
        System.out.println(x + z);
    }
    static int stringToInt(String someIntNum){

        return Integer.parseInt(someIntNum);
    }
    static double stringToDouble(String someDoubleNum){

        return Double.parseDouble(someDoubleNum);
    }
}
