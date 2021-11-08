package fourthLection;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class HW_4_2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Map<String, ArrayList<Integer>> planetsMap = new HashMap<>();

        ArrayList<Integer> venusDataList = new ArrayList<>();
        ArrayList<Integer> earthDataList = new ArrayList<>();
        ArrayList<Integer> marsDataList = new ArrayList<>();

        venusDataList.add(108);
        venusDataList.add(12104);
        earthDataList.add(150);
        earthDataList.add(12742);
        marsDataList.add(228);
        marsDataList.add(6779);

        planetsMap.put("Venus", venusDataList);
        planetsMap.put("Earth", earthDataList);
        planetsMap.put("Mars", marsDataList);

        System.out.print("Enter the name of the planet: ");
        String planetName = in.next();

        if (planetsMap.containsKey(planetName)) {
            ArrayList targetPlanetDataList = planetsMap.get(planetName);
            System.out.println("Distance to sun: " + targetPlanetDataList.get(0));
            System.out.println("Diameter: " + targetPlanetDataList.get(1));
        } else {
            System.out.println("There is no such planet");
        }
    }
}



