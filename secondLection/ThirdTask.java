package secondLection;

class ThirdTask {

    public static void main(String[] args){

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.show();
        b.show();
        c.show();
        d.show();

        a.count(2, 5);
        b.count(2, 5);
        c.count(2, 5);
        d.count(2, 5);
    }
}

class A{

    double count(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    void show(){
        System.out.println("A");
    }
}

class B extends A{
    double count(int a, int b){
        System.out.println(a-b);
        return a-b;
    }

    void show(){
        System.out.println("B");
    }
}

class C extends A{
    double count(int a, int b){
        System.out.println(a*b);
        return a*b;
    }

    void show(){
        System.out.println("C");
    }
}

class D extends B{
    double count(int a, int b){
        double result = (double) a/b;
        System.out.println(result);
        return result;
    }

    void show(){
        System.out.println("D");
    }
}