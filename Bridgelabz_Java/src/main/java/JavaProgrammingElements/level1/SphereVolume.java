
import java.util.*;
public class SphereVolume{
    public static void main(String[] args){
        int radius = 6378;
        double volume = (4 * 3.14 * radius * radius * radius) / 3;
        double volume_in_miles = 1.6 * volume;
        System.out.println("The volume of the sphere is " + volume + " and in miles is " + volume_in_miles + "\n");
    }
}