package thirdLection;

public class CW_3_2 {

    public static void main(String[] args){

        Params p = new Params(3, 4, 6);
        Figure circle = new Circle();
        circle.show(p);
        Figure square = new Square();
        square.show(p);
    }
}

abstract class Quadrangle implements Figure{

    String name;

    public String getFigureName(){

        return this.name;
    }

    public void show(Params p){

        System.out.println(this.getFigureName());
        System.out.println(this.getPerimeter(p));
        System.out.println(this.getSquare(p));
    }
}

class Square extends Quadrangle{

    {
        this.name = "Square";
    }

    public double getPerimeter(Params p){

        int a = p.a;
        return 4*a;
    }

    public double getSquare(Params p){

        int a = p.a;
        return a*a;
    }
}

class Rectangle extends Quadrangle{

    {
        this.name = "Rectangle";
    }

    public double getPerimeter(Params p){

        int a = p.a;
        int b = p.b;
        return 2*a+2*b;
    }

    public double getSquare(Params p){

        int a = p.a;
        int b = p.b;
        return a*b;
    }
}

class Circle implements Figure{

    public String getFigureName(){

        return "Circle";
    }

    public double getPerimeter(Params p){

        int r = p.r;
        return 2*Math.PI*r;
    }

    public double getSquare(Params p){

        int r = p.r;
        return Math.PI*r*r;
    }

    public void show(Params p){

        System.out.println(this.getFigureName());
        System.out.println(this.getPerimeter(p));
        System.out.println(this.getSquare(p));
    }
}

class Params{

    int a;
    int b;
    int r;

    Params(int a, int b, int r){
        this.a = a;
        this.b = b;
        this.r = r;
    }
}

interface Figure{

    String getFigureName();
    double getPerimeter(Params p);
    double getSquare(Params p);
    void show(Params p);
}