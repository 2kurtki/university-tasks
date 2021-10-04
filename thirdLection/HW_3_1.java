package thirdLection;

public class HW_3_1 {

    public static void main(String[] args){

        Parameters p = new Parameters(2, 3.1, new double[] {7.4, 5}, new double[] {4, 6});
        ArithmeticOperations num = new Numbers();
        ArithmeticOperations complexNum = new ComplexNumbers();

        num.multiply(p);
        complexNum.subtract(p);
    }
}

class Numbers implements ArithmeticOperations {

    public void add(Parameters p){

        double a = p.a;
        double b = p.b;
        System.out.println(a + b);
    }

    public void subtract(Parameters p){

        double a = p.a;
        double b = p.b;
        System.out.println(a - b);
    }

    public void multiply(Parameters p){

        double a = p.a;
        double b = p.b;
        System.out.println(a * b);
    }

    public void divide(Parameters p){

        double a = p.a;
        double b = p.b;
        System.out.println(a / b);
    }
}

class ComplexNumbers implements ArithmeticOperations {

    public void add(Parameters p){

        double x1 = p.complexA[0];
        double y1 = p.complexA[1];
        double x2 = p.complexB[0];
        double y2 = p.complexB[1];

        double rPart = x1 + x2;
        double iPart = y1 + y2;
        System.out.printf("%.2f%+.2fi", rPart, iPart);
    }

    public void subtract(Parameters p){

        double x1 = p.complexA[0];
        double y1 = p.complexA[1];
        double x2 = p.complexB[0];
        double y2 = p.complexB[1];

        double rPart = x1 - x2;
        double iPart = y1 - y2;
        System.out.printf("%.2f%+.2fi", rPart, iPart);
    }

    public void multiply(Parameters p){

        double x1 = p.complexA[0];
        double y1 = p.complexA[1];
        double x2 = p.complexB[0];
        double y2 = p.complexB[1];

        double rPart = x1 * x2 + y1 * y2;
        double iPart = x1 * y2 + x2 * y1;
        System.out.printf("%.2f%+.2fi", rPart, iPart);
    }

    public void divide(Parameters p){

        double x1 = p.complexA[0];
        double y1 = p.complexA[1];
        double x2 = p.complexB[0];
        double y2 = p.complexB[1];

        double rPart = (x1 * x2 + y1 * y2)/(x2 * x2 + y2 * y2);
        double iPart = (x2 * y1 - x1 * y2)/(x2 * x2 + y2 * y2);
        System.out.printf("%.2f%+.2fi", rPart, iPart);
    }
}

class Parameters{

    double a;
    double b;
    double[] complexA;
    double[] complexB;

    Parameters(double a, double b, double[] complexA, double[] complexB){
        this.a = a;
        this.b = b;
        this.complexA = complexA;
        this.complexB = complexB;
    }
}

interface ArithmeticOperations {

    void add(Parameters p);
    void subtract(Parameters p);
    void multiply(Parameters p);
    void divide(Parameters p);
}
