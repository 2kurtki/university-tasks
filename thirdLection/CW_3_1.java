package thirdLection;

public class CW_3_1 {

    public static void main(String[] args){

        Fruit apple = new Apple("big apple", 50);
        System.out.println(apple.getWeight());
        Fruit banana = new Banana();
        System.out.println(banana.getName());
        Fruit orange = new Orange();
        System.out.println(orange.isTasty());
    }
}

abstract class AbstractFruit implements Fruit {

    String name;
    int weight;

    AbstractFruit(){

    }

    AbstractFruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }
}

class Apple extends AbstractFruit {

    Apple(){
        this.name = "apple";
        this.weight = 24;
    }

    Apple(String name, int weight){
        super(name, weight);
    }

    public boolean isTasty(){
        return false;
    }
}

class Banana extends AbstractFruit {

    Banana(){
        this.name = "banana";
        this.weight = 19;
    }

    Banana(String name, int weight){
        super(name, weight);
    }

    public boolean isTasty(){
        return true;
    }
}

class Orange implements Fruit {

    public String getName(){
        return "orange";
    }

    public int getWeight(){
        return 30;
    }

    public boolean isTasty(){
        return true;
    }
}

interface Fruit {

    String getName();
    int getWeight();
    boolean isTasty();
}
