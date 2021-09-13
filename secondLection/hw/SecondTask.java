package secondLection.hw;

class SecondTask {

    public static void main(String[] args){

        Parallelepiped par = new Parallelepiped(1, 3, 6);
        System.out.println(getVolume(par));
        System.out.println(getArea(par));
    }

    private static int getVolume(Parallelepiped par){

        int a = par.getA();
        int b = par.getB();
        int c = par.getC();
        return a*b*c;
    }

    private static int getArea(Parallelepiped par){

        int a = par.getA();
        int b = par.getB();
        int c = par.getC();
        return 2*(a*b + a*c + b*c);
    }
}

class Parallelepiped {
    
    private int a;
    private int b;
    private int c;

    Parallelepiped(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }

    int getA(){
        return this.a;
    }

    int getB(){
        return this.b;
    }

    int getC(){
        return this.c;
    }

    void setA(int a){
        if (a > 0) {
            this.a = a;
            return;
        }
        System.out.println("Wrong input");
    }

    void setB(int b){
        if (b > 0) {
            this.b = b;
            return;
        }
        System.out.println("Wrong input");
    }

    void setC(int c){
        if (c > 0) {
            this.c = c;
            return;
        }
        System.out.println("Wrong input");
    }
}
