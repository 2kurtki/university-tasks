package secondLection;

class FourthTask {

    public static void main(String[] args){

    }
}

class Cylinder{

    double getArea(int r, int h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }

    double getVolume(int r, int h){
        return Math.PI*r*r*h;
    }

    double getArea(double r, double h){
        return 2*Math.PI*r*h + 2*Math.PI*r*r;
    }

    double getVolume(double r, double h){
        return Math.PI*r*r*h;
    }

    double getArea(String r, String h){
        double dR = Double.parseDouble(r);
        double dH = Double.parseDouble(h);
        return 2*Math.PI*dR*dH + 2*Math.PI*dR*dR;
    }

    double getVolume(String r, String h){
        double dR = Double.parseDouble(r);
        double dH = Double.parseDouble(h);
        return Math.PI*dR*dR*dH;
    }
}