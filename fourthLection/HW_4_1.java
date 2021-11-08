package fourthLection;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HW_4_1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Map<String, Planet> planetsMap = new HashMap<>();

        planetsMap.put("Venus", new Planet(108, 12104));
        planetsMap.put("Earth", new Planet(150, 12742));
        planetsMap.put("Mars", new Planet(228,6779));

        System.out.print("Enter the name of the planet: ");
        String planetName = in.next();

        if (planetsMap.containsKey(planetName)) {
            Planet targetPlanet = planetsMap.get(planetName);
            System.out.println("Distance to sun: " + targetPlanet.getDistanceToSun());
            System.out.println("Diameter: " + targetPlanet.getDiameter());
        } else {
            System.out.println("There is no such planet");
        }
    }
}

class Planet{

    private int distanceToSun;
    private int diameter;

    Planet(int distanceToSun, int diameter){
        this.distanceToSun = distanceToSun;
        this.diameter = diameter;
    }

    public int getDistanceToSun(){
        return this.distanceToSun;
    }

    public int getDiameter(){
        return this.diameter;
    }

    public void setDistanceToSun(int distanceToSun){

        if(distanceToSun > 0){
            this.distanceToSun = distanceToSun;
        }

        System.out.println("Invalid input.");
    }

    public void setDiameter(int diameter){

        if(diameter > 0){
            this.diameter = diameter;
        }

        System.out.println("Invalid input.");
    }
}