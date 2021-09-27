package thirdLection;

public class HW_3_1 {

    public static void main(String[] args){

    }
}

class Numbers implements ArithmeticOperations {

    public double add(Parameters p){

        double a = p.a;
        double b = p.b;
        return a + b;
    }

    public double subtract(Parameters p){

        double a = p.a;
        double b = p.b;
        return a - b;
    }

    public double multiply(Parameters p){

        double a = p.a;
        double b = p.b;
        return a * b;
    }

    public double divide(Parameters p){

        double a = p.a;
        double b = p.b;
        return a / b;
    }
}

class Parameters{

    double a;
    double b;
    double xA;
    double xB;

    Parameters(int a, int b, double xA, double xB){
        this.a = a;
        this.b = b;
        this.xA = xA;
        this.xB = xB;
    }
}

interface ArithmeticOperations {

    double add(Parameters p);
    double subtract(Parameters p);
    double multiply(Parameters p);
    double divide(Parameters p);
}
