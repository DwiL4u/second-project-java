enum Days {
  MONDAY("First day of the work week"),
  TUESDAY("Second day of the work week"),
  WEDNESDAY("Third day of the work week"),
  THURSDAY("Almost weekend"),
  FRIDAY("Last day of the work week"),
  SATURDAY("Weekend"),
  SUNDAY("Relaxing day");

  private String description;

  //constructor
  Days(String description) {
    this.description = description;

}

//getter method
public String getDescription() {
  return description;
}
}



public class EnumExample {
  public static void main(String[] args) {
    //access an enum value by name
    Days day = Days.FRIDAY;
    System.out.println("Day: " + day);

    //access an enum value and its description
    Days day1 = Days.SATURDAY;
    System.out.println("Day: " + day1 + ", Description: " + day1.getDescription());

    //loop through all the enum values
    for (Days d : Days.values()) {
      System.out.println(d + ": " + d.getDescription());
    }


  }

}



