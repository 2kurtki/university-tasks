package secondLection;

class FirstTask {

    public static void main(String[] args){

        Circle circle = new Circle(4, 5, 9);
        circle.print();
        circle.move();
        circle.distToOtherCircle();
        circle.changeRadius(5);
        circle.getPerimeter();
        circle.getSquare();
    }
}

class Circle {
    int x;
    int y;
    int r;

    Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    void print(){
        System.out.printf("Coordinates: x: %d, y: %d, R: %d", x, y, r);
    }

    void move(){
        x++;
        y--;
        System.out.println("moved");
    }

    double distToOtherCircle(){
        return x*r;
    }

    void changeRadius(int r){
        this.r = r;
        System.out.println("radius changed");
    }

    double getPerimeter(){
        return x+y;
    }

    double getSquare(){
        return x*y;
    }
}
