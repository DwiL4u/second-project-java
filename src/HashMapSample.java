import java.util.HashMap;

public class HashMapSample {
  public static void main(String[] args) {
    //create a HashMap
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    //add key-value countries to the HashMap
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("Japan", "Tokyo");

    //access a value by key
    System.out.println("Capital of Japan: " + capitalCities.get("Japan"));

    //change a value by key
    capitalCities.put("USA", "New York");

    //retrieve the size of the HashMap
    System.out.println("Number of countries: " + capitalCities.size());

    //retrieve a value by key using a loop
    for (String country : capitalCities.keySet()) {
      System.out.println("Capital of " + country + ": " + capitalCities.get(country));
    }

    //retrieve a value by key using get() method
    String value = capitalCities.get("England");
    System.out.println("Capital of England: " + value);

    //check if the HashMap contains a key
    if (capitalCities.containsKey("Norway")) {
      System.out.println("Norway is in the list");
    }

    //iterate over the HashMap using forEach() method
    capitalCities.forEach((country, capital) -> {
      System.out.println("Capital of " + country + ": " + capital);
    });
  }

}
