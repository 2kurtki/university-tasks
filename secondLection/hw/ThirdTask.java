package secondLection.hw;

class ThirdTask {

    public static void main(String[] args){

    }
}

class Main{

    protected int propX = 0;
    protected int propY = 0;
    protected int propZ = 0;

    Main(){

    }

    Main(int propX, int propY, int propZ){
        this.propX = propX;
        this.propY = propY;
        this.propZ = propZ;
    }

    int strangeSum(int a, int b){
        return a+b-this.propX;
    }

    int strangeMultiply(int a, int b){
        return a*b+this.propY-this.propZ;
    }
}

class Secondary extends Main{

    Secondary(){
        super();
    }

    Secondary(int propX, int propY, int propZ){
        super(propX, propY, propZ);
    }

    protected int strangeSum(int a, int b){
        return a+b*this.propX;
    }

    protected int strangeMultiply(int a, int b){
        return a*b+this.propY*this.propZ;
    }
}

class Side extends Secondary{

    Side(){
        super();
    }

    Side(int propX, int propY, int propZ){
        super(propX, propY, propZ);
    }

    protected int strangeSum(int a, int b){
        return a+b+this.propX;
    }

    protected int strangeMultiply(int a, int b){
        return a*b*this.propY*this.propZ;
    }
}