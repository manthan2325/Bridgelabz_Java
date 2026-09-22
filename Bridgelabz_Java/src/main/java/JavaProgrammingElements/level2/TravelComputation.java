// Create TravelComputation Class to compute the Distance and Travel Time
import java.util.*;

class TravelComputation {
   
   public static void main(String[] args) {

      // Create a variable name to indicate the person traveling
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      String fromCity = sc.next();
      String viaCity = sc.next();
      String toCity = sc.next();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia = sc.nextDouble();

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia = sc.nextInt();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity = sc.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity = sc.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
      sc.close();
   }
}