package firstLection;

class SecondTask {
    public static void main (String[] args){

        System.out.println(getParallelepipedVolume(1, 2, 3));
        System.out.println(getBallVolume(3));
        System.out.println(getCylinderVolume(2.2, 5));
    }
    static double getParallelepipedVolume(double a, double b, double c){

        return (a * b * c);
    }
    static double getBallVolume(double r){

        return (4 / 3 * Math.PI * Math.pow(r, 3));
    }
    static double getCylinderVolume(double r, double h){

        return (Math.PI * Math.pow(r, 2) * h);
    }
}
